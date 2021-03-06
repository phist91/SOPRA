package de.uni_muenster.sopra2015.gruppe8.octobus.controller.form;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.Controller;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerDatabase;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerManager;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterTable;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.ListenerButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Ticket;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.forms.FormTicket;

import java.util.ArrayList;

/**
 * Controller for FormTicket class.
 * @pre User is logged in and has Ticket-Planner-Role.
 */
public class ControllerFormTicket extends Controller implements ListenerButton
{
	private ControllerDatabase controllerDatabase;
	FormTicket formTicket;
	private int objectID;
	private Ticket ticket;

	public ControllerFormTicket(FormTicket formTicket, int objectID)
	{
		super();
		controllerDatabase = ControllerDatabase.getInstance();
		this.formTicket = formTicket;
		this.objectID = objectID;
		if(objectID != -1)
		{
			setTicketInfo();
		}
	}

	@Override
	public void buttonPressed(EmitterButton emitter)
	{
		switch (emitter)
		{
			case FORM_TICKET_SAVE:
				if(parseValuesFromForm())
				{
					if (saveToDB())
					{
						ControllerManager.informTableContentChanged(EmitterTable.TAB_TICKET);
						closeDialog();
					}
				}
				break;

			case FORM_TICKET_CANCEL:
				closeDialog();
				break;
		}
	}

	/**
	 * Fetch ticket object from DB
	 */
	private void setTicketInfo()
	{
		ticket = controllerDatabase.getTicketById(objectID);
	}

	/**
	 * Inserts the values of the Bus which is going to
	 * be changed into the form.
	 */
	public void insertValuesIntoForm()
	{
		if(objectID != -1)
		{
			formTicket.setName(ticket.getName());
			formTicket.setPrice(ticket.getPrice());
			formTicket.setNumPassengers(ticket.getNumPassengers());
			formTicket.setDescription(ticket.getDescription());
		}
	}

	/**
	 * Saves the current ticket to the DB.
	 * @return true on success
	 */
	private boolean saveToDB()
	{
		if(objectID == -1)
			controllerDatabase.addTicket(ticket);
		else
			controllerDatabase.modifyTicket(ticket);
		return true;
	}


	/**
	 * Checks if form input is correct and adds values to local ticket.
	 * @return Returns true on correct input.
	 */
	private boolean parseValuesFromForm()
	{
		formTicket.setCursor(true);
		if(objectID == -1)
		{
			ticket = new Ticket();
		}
		String name = formTicket.getName();
		int price = formTicket.getPrice();
		int numPassangers = formTicket.getNumPassengers();
		String description = formTicket.getDescription();

		ArrayList<String> errorFields = new ArrayList<>();
		if(name == null)
			errorFields.add("Ungültige Eingabe des Namen. Es wurden illegale Zeichen verwendet.");
		else if(name.trim().length() == 0)
			errorFields.add("Der Name darf nicht leer sein.");
		else if (name.trim().length() < 5)
			errorFields.add("Der Name muss mindestens 5 Zeichen umfassen.");
		if(price == -1)
			errorFields.add("Der Preis darf nicht leer sein.");
		if(numPassangers == -1)
			errorFields.add("Die Anzahl der Fahrgäste darf nicht leer sein.");
		if(description == null)
			errorFields.add("Ungültige Eingabe der Beschreibung. Es wurden illegale Zeichen verwendet.");

		if(errorFields.size() > 0)
		{
			String errorMessage = "Die eingegeben Daten sind nicht gültig.\n";
			errorMessage += errorListToString(errorFields);
			formTicket.showErrorForm(errorMessage);
			return false;
		}
		else
		{
			ticket.setName(name);
			ticket.setPrice(price);
			ticket.setNumPassengers(numPassangers);
			ticket.setDescription(description);
			return true;
		}
	}

	@Override
	protected void addListeners()
	{
		ControllerManager.addListener(this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener(this);
	}

	/**
	 * Closes current dialog.
	 */
	private void closeDialog()
	{
		formTicket.dispose();
		removeListeners();
	}
}
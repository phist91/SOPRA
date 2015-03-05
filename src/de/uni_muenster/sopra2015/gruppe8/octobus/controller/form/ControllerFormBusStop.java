package de.uni_muenster.sopra2015.gruppe8.octobus.controller.form;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.Controller;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerManager;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.forms.FormBusStop;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.ListenerButton;

import javax.swing.*;

/**
 * Created by Lars on 02-Mar-15.
 */
public class ControllerFormBusStop extends Controller implements ListenerButton
{
	private FormBusStop dialog;
	int objectId;

	public ControllerFormBusStop(FormBusStop dialog, int objectId)
	{
		super();
		this.dialog = dialog;
		this.objectId = objectId;
	}

	@Override
	public void buttonPressed(EmitterButton emitter)
	{
		switch(emitter)
		{
			case FORM_BUS_STOP_SAVE:
				//TODO:Save them
				closeDialog();
				break;

			case FORM_BUS_STOP_CANCEL:
				closeDialog();
				break;

			case FORM_BUS_STOP_ADD_POINT:
				while(true)
				{
					String newAnswer = dialog.showNewStoppingPointDialog();
					if (newAnswer != null)
					{
						if (newAnswer.length() == 0)
						{
							dialog.showErrorForm("Bitte geben Sie einen Namen für den Haltepunkt ein.");
						} else
						{
							dialog.addStoppingPoint(newAnswer);
							break;
						}
					}
					else
					{
						break;
					}
				}
				break;

			case FORM_BUS_STOP_DELETE_POINT:
				if(dialog.getSelectedStoppingPoint() == -1)
					break;
				if(dialog.showDeleteStoppingPointDialog() == JOptionPane.YES_OPTION)
					dialog.removeStoppingPoint(dialog.getSelectedStoppingPoint());
				break;

			case FORM_BUS_STOP_EDIT_POINT:
				//Don't do anything if no stop-point is selected
				if(dialog.getSelectedStoppingPoint() == -1)
					break;
				while(true)
				{
					String newAnswer = dialog.showEditStoppingPointDialog(dialog.getSelectedStoppingPointName());
					if (newAnswer != null)
					{
						if (newAnswer.length() == 0)
						{
							dialog.showErrorForm("Bitte geben Sie einen Namen für den Haltepunkt ein.");
						} else
						{
							dialog.editStoppingPoint(dialog.getSelectedStoppingPoint(), newAnswer);
							break;
						}
					}
					else
					{
						break;
					}
				}
				break;
		}
	}

	@Override
	protected  void addListeners()
	{
		ControllerManager.addListener((ListenerButton)this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener((ListenerButton)this);
	}

	private void closeDialog()
	{
		dialog.dispose();
		removeListeners();
	}
}

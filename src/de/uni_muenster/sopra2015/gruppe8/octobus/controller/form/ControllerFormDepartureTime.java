package de.uni_muenster.sopra2015.gruppe8.octobus.controller.form;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.Controller;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerManager;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.EmitterWindow;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.ListenerButton;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Route;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Tuple;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.forms.FormDepartureTime;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Controller for FormDepartureTime class.
 * Used to set departure times in FormRoute
 * @pre User is logged in and has Network-Planner-Role
 */
public class ControllerFormDepartureTime extends Controller implements ListenerButton
{
	private FormDepartureTime formDepartureTime;
	private int departureTimeStart;
	private int departureTimeEnd;
	private ArrayList<Tuple<DayOfWeek, Boolean>> departureDays;
	private int departureFreqency;
	private Route route;

	public ControllerFormDepartureTime(FormDepartureTime formDepartureTime, Route route)
	{
		super();
		this.route = route;
		this.formDepartureTime = formDepartureTime;
	}


	@Override
	public void buttonPressed(EmitterButton btn)
	{
		switch (btn)
		{
			case FORM_ROUTE_STEP2_DEPARTURE_SAVE:
				//Checks for valid input and sets global attributes to form values
				int temp = parseValuesFromFormDeparture();
				if (temp == 1)
				{
					formDepartureTime.setCursor(true);
					//Only start time and days of week given
					HashMap<DayOfWeek,LinkedList<Integer>> startTimes = route.getStartTimes();
					//Adds the new start times to the route for each selected day
					for (Tuple<DayOfWeek, Boolean> day : departureDays)
					{
						if(day.getSecond())
						{
							HashSet<Integer> tempSet = new HashSet<>();
							LinkedList<Integer> tempList = new LinkedList<>();
							tempList.addAll(startTimes.get(day.getFirst()));
							tempList.add(departureTimeStart);
							tempSet.addAll(tempList);
							startTimes.get(day.getFirst()).clear();
							startTimes.get(day.getFirst()).addAll(tempSet);
						}
					}
					route.setStartTimes(startTimes);
					ControllerManager.informWindowClose(EmitterWindow.FORM_ROUTE_STEP2_DEPARTURE_CLOSE);
					closeDialog();
					formDepartureTime.setCursor(false);
				} else if (temp == 2)
				{
					formDepartureTime.setCursor(true);
					//start time, end time, frequency and days of week are given
					HashMap<DayOfWeek,LinkedList<Integer>> startTimes = route.getStartTimes();
					ArrayList<Integer> departures = new ArrayList<>();
					//Adds all times between start and end time in the given frequency
					int remaining = departureTimeStart;
					do
					{
						departures.add(remaining);
						remaining += departureFreqency;
					}
					while(remaining <= departureTimeEnd);
					//Adds the new start times to the route for each selected day
					for (Tuple<DayOfWeek, Boolean> day : departureDays)
					{
						if(day.getSecond())
						{
							HashSet<Integer> tempSet = new HashSet<>();
							departures.addAll(startTimes.get(day.getFirst()));
							tempSet.addAll(departures);
							startTimes.get(day.getFirst()).clear();
							startTimes.get(day.getFirst()).addAll(tempSet);
						}
					}
					route.setStartTimes(startTimes);
					ControllerManager.informWindowClose(EmitterWindow.FORM_ROUTE_STEP2_DEPARTURE_CLOSE);
					closeDialog();
					formDepartureTime.setCursor(false);
				}
				break;

			case FORM_ROUTE_STEP2_DEPARTURE_CANCEL:
				closeDialog();
				break;
		}
	}

	/**
	 * Parses values from FormDepartureTime.
	 * @return Returns 0 on wrong input; 1 on only start time; 2 on start time, end time and frequency
	 */
	private int parseValuesFromFormDeparture()
	{
		int freqency = formDepartureTime.getFnFrequency();

		ArrayList<Tuple<DayOfWeek, Boolean>> days = new ArrayList<>();
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.MONDAY, formDepartureTime.getJcbMo()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.TUESDAY, formDepartureTime.getJcbDi()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.WEDNESDAY, formDepartureTime.getJcbMi()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.THURSDAY, formDepartureTime.getJcbDo()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.FRIDAY, formDepartureTime.getJcbFr()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.SATURDAY, formDepartureTime.getJcbSa()));
		days.add(new Tuple<DayOfWeek, Boolean>(DayOfWeek.SUNDAY, formDepartureTime.getJcbSo()));

		ArrayList<String> errorFields = new ArrayList<>();
		if(formDepartureTime.getFnStartTime_Hour() == -1 || formDepartureTime.getFnStartTime_Minute() == -1)
			errorFields.add("Startzeit muss vollständig angegeben sein.");
		if(formDepartureTime.getFnEndTime_Hour() == -1 && formDepartureTime.getFnEndTime_Minute() == -1)
		{
			if(freqency != -1)
				errorFields.add("Frequenz muss zusammen mit einer vollständigen Endzeit angegeben werden.");
		}
		else
		{
			if(formDepartureTime.getFnEndTime_Hour() == -1 || formDepartureTime.getFnEndTime_Minute() == -1)
				errorFields.add("Endzeit muss vollständig angegeben werden.");
			if(formDepartureTime.getFnEndTime_Hour() <= formDepartureTime.getFnStartTime_Hour())
			{
				errorFields.add("Endzeit muss später als Startzeit sein.");
			}
			else if(formDepartureTime.getFnEndTime_Hour() == formDepartureTime.getFnStartTime_Hour())
			{
				if( formDepartureTime.getFnEndTime_Minute() <= formDepartureTime.getFnStartTime_Minute())
				{
					errorFields.add("Endzeit muss später als Startzeit sein.");
				}
			}
			if(freqency == -1)
				errorFields.add("Frequenz darf nicht leer sein, wenn eine Endzeit angegeben ist.");
			if(freqency == 0)
				errorFields.add("Frequenz darf nicht Null sein.");
		}
		boolean minDaysChecked = false;
		for (Tuple<DayOfWeek, Boolean> day : days)
		{
			if(day.getSecond())
				minDaysChecked = true;
		}
		if(!minDaysChecked)
			errorFields.add("Mindestens ein Tag muss ausgewählt sein.");

		if(errorFields.size() > 0)
		{
			String errorMessage = "Die eingegeben Daten sind nicht gültig:\n";
			errorMessage += errorListToString(errorFields);
			formDepartureTime.showErrorForm(errorMessage);
			return 0;
		}
		else
		{
			if(formDepartureTime.getFnEndTime_Hour() == -1 || formDepartureTime.getFnEndTime_Minute() == -1){
				departureTimeStart = formDepartureTime.getFnStartTime_Hour() * 60 + formDepartureTime.getFnStartTime_Minute();
				departureDays = days;
				return 1;
			}
			else
			{
				departureTimeStart = formDepartureTime.getFnStartTime_Hour() * 60 + formDepartureTime.getFnStartTime_Minute();
				departureTimeEnd = formDepartureTime.getFnEndTime_Hour() * 60 + formDepartureTime.getFnEndTime_Minute();
				departureFreqency = freqency;
				departureDays = days;
				return 2;
			}
		}
	}

	@Override
	protected void addListeners()
	{
		ControllerManager.addListener((ListenerButton) this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener((ListenerButton) this);
	}

	/**
	 * Closes current dialog.
	 */
	private void closeDialog()
	{
		formDepartureTime.dispose();
		removeListeners();
	}
}

package de.uni_muenster.sopra2015.gruppe8.octobus.controller.tab;

import de.uni_muenster.sopra2015.gruppe8.octobus.controller.Controller;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerDatabase;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.ControllerManager;
import de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners.*;
import de.uni_muenster.sopra2015.gruppe8.octobus.model.Tour;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.tabs.TabWorkPlan;
import de.uni_muenster.sopra2015.gruppe8.octobus.view.tabs.table_models.TableDate;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Controller for TabWorkPlan class.
 * @pre User is logged in and has Bus-Driver-Role.
 */
public class ControllerTabWorkPlan extends Controller implements ListenerButton, ListenerTable
{
	private ControllerDatabase controllerDatabase;
	private TabWorkPlan tabWorkPlan;
	private int userId;

	/**
	 * Constructor, save parameters as attributes
	 * @param tabWorkPlan
	 * @param userId of logged in user
	 * @pre user-id is valid id in employee-db-table and corresponding employee has bus-driver-role
	 */
	public ControllerTabWorkPlan(TabWorkPlan tabWorkPlan, int userId)
	{
		super();
		controllerDatabase = ControllerDatabase.getInstance();
		this.userId = userId;
		this.tabWorkPlan = tabWorkPlan;
	}

	@Override
	protected void addListeners()
	{
		ControllerManager.addListener((ListenerButton) this);
		ControllerManager.addListener((ListenerTable) this);
	}

	@Override
	protected void removeListeners()
	{
		ControllerManager.removeListener((ListenerButton) this);
		ControllerManager.removeListener((ListenerTable) this);
	}

	/**
	 * Exports all future tours of logged-in bus-driver to iCal-Format
	 */
	private void exportToIcal()
	{
		//Some SimpleDataFormats to convert Date to String
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYYMMdd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
		ArrayList<Tour> tours = controllerDatabase.getToursForEmployeeId(userId);
		//New FileChooser
		JFileChooser fc = new JFileChooser();
		fc.setAcceptAllFileFilterUsed(false);
		//User could only select ical-files
		fc.addChoosableFileFilter(new FileNameExtensionFilter("iCal-Datei", "ical"));
		int returnVal = fc.showSaveDialog(null);
		if(returnVal == JFileChooser.CANCEL_OPTION)
			return;
		//If user pressed save, start export
		try {
			//Open file-writer
			FileWriter fileWriter = new FileWriter(fc.getSelectedFile());
			BufferedWriter bw = new BufferedWriter(fileWriter);
			//Write ical-head
			bw.write("BEGIN:VCALENDAR");
			bw.newLine();
			bw.write("VERSION:2.0");
			bw.newLine();
			bw.write("BEGIN:VTIMEZONE");
			bw.newLine();
			bw.write("TZID:Europe/Berlin");
			bw.newLine();
			bw.write("X-LIC-LOCATION:Europe/Berlin");
			bw.newLine();
			bw.write("BEGIN:DAYLIGHT");
			bw.newLine();
			bw.write("TZOFFSETFROM:+0100");
			bw.newLine();
			bw.write("TZOFFSETTO:+0200");
			bw.newLine();
			bw.write("TZNAME:CEST");
			bw.newLine();
			bw.write("DTSTART:19700329T020000");
			bw.newLine();
			bw.write("END:DAYLIGHT");
			bw.newLine();
			bw.write("BEGIN:STANDARD");
			bw.newLine();
			bw.write("TZOFFSETFROM:+0200");
			bw.newLine();
			bw.write("TZOFFSETTO:+0100");
			bw.newLine();
			bw.write("TZNAME:CET");
			bw.newLine();
			bw.write("DTSTART:19701025T030000");
			bw.newLine();
			bw.write("END:STANDARD");
			bw.newLine();
			bw.write("END:VTIMEZONE");
			bw.newLine();
			//Add ical-event foreach tour
			for(Tour tour : tours)
			{
				Date start = tour.getStartTimestamp();

				bw.write("BEGIN:VEVENT");
				bw.newLine();
				bw.write("LOCATION:" + tour.getRoute().getStart().getName());
				bw.newLine();
				bw.write("SUMMARY:" + tour.getRoute().getName());
				bw.newLine();
				String busName = tour.getBus() == null ? "" : tour.getBus().getLicencePlate();
				bw.write("DESCRIPTION:" + tour.getRoute().getName() + " von " + tour.getRoute().getStart().getName() + " bis " + tour.getRoute().getEnd().getName() + " - Bus: " + busName);
				bw.newLine();
				bw.write("CLASS:PRIVATE");
				bw.newLine();
				bw.write("DTSTART;TZID=Europe/Berlin:" + dateFormat.format(start) + "T" + timeFormat.format(start));
				bw.newLine();
				Date end = new Date();
				end.setTime(start.getTime()+tour.getRoute().getDuration()*60*1000);
				bw.write("DTEND;TZID=Europe/Berlin:" + dateFormat.format(end)+"T"+timeFormat.format(end));
				bw.newLine();
				bw.write("DTSTAMP:20150309T170741");
				bw.newLine();
				bw.write("END:VEVENT");
				bw.newLine();
			}
			bw.write("END:VCALENDAR");

			//Close writers
			bw.close();
			fileWriter.close();
		}
		catch (Exception e)
		{
			tabWorkPlan.showMessageDialog("iCal-Datei konnte nicht erstellt werden.");
		}
	}

	@Override
	public void buttonPressed(EmitterButton btn)
	{
		switch (btn)
		{
			case TAB_WORK_PLAN_EXPORT:
				exportToIcal();
				break;

			case TAB_WORK_PLAN_PRINT:
				ControllerManager.informPrintRequested(EmitterPrint.WORK_PLAN, userId);
				break;
		}
	}

	/**
	 * Used to fill table with tours related to the logged in user.
	 * Tours are fetched from DB.
	 */
	public void fillTable()
	{
		ArrayList<Tour> tours = controllerDatabase.getToursForEmployeeId(userId);
		Object[][] data = new Object[tours.size()][7];
		for(int i=0; i<tours.size(); i++)
		{
			Tour tour = tours.get(i);
			data[i][0] = tour.getId();
			data[i][1] = new TableDate(tour.getStartTimestamp(), TableDate.Type.DATE_TIME);
			data[i][2] = tour.getRoute().getName();
			data[i][3] = tour.getRoute().getStart().getName();
			data[i][4] = tour.getRoute().getEnd().getName();
			data[i][5] = tour.getRoute().getDuration();
			if(tour.getBus() == null)
				data[i][6] = "noch nicht gewählt";
			else
				data[i][6] = tour.getBus().getLicencePlate();
		}
		tabWorkPlan.fillTable(data);
		tabWorkPlan.enableButtons(data.length > 0);
	}

	@Override
	public void tableSelectionChanged(EmitterTable emitter)
	{

	}

	@Override
	public void tableContentChanged(EmitterTable emitter)
	{
		switch(emitter)
		{
			case TAB_WORKPLAN:
				fillTable();
				break;
		}
	}

	@Override
	public void tableFocusLost(EmitterTable emitter)
	{

	}
}

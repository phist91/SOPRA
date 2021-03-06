package de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners;

/**
 * Used to communicate with the ControllerFrameMain class.
 * Each value tells the ControllerMainFrame to open a certain JDialog.
 */
public enum EmitterWindow
{
	FORM_LOGIN,
	FORM_CHANGE_PASSWORD,

	FORM_BUS_NEW,
	FORM_BUS_EDIT,

	FORM_EMPLOYEE_NEW,
	FORM_EMPLOYEE_EDIT,

	FORM_TICKET_NEW,
	FORM_TICKET_EDIT,

	FORM_BUS_STOP_NEW,
	FORM_BUS_STOP_EDIT,
	FORM_BUS_STOP_PRINT,

	FORM_ROUTE_NEW,
	FORM_ROUTE_EDIT,
	FORM_ROUTE_STEP2_DEPARTURE_CLOSE,

    FORM_TOUR_EDIT,
	FORM_TOUR_RESET_EMPLOYEE,
	FORM_TOUR_RESET_BUS,
	FORM_TOUR_SANITY,

	TAB_SCHEDULE_SET_DAY,

	DIALOG_NO_DB
}

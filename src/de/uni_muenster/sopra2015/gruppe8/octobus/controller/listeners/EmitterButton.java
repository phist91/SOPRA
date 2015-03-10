package de.uni_muenster.sopra2015.gruppe8.octobus.controller.listeners;

/**
 * Used to describe buttons.
 * Each button has a unique value consisting of the source class and its name
 */
public enum EmitterButton
{
	PANEL_PASSENGER_SHOW_NETWORK,
	PANEL_PASSENGER_SEARCH_CONNECTION,
	PANEL_PASSENGER_SHOW_TICKETS,
	PANEL_PASSENGER_LOGIN,

	PANEL_EMPLOYEE_LOGOUT,
	PANEL_EMPLOYEE_CHANGE_PASSWORD,

	FORM_LOGIN_LOGIN,
	FORM_LOGIN_CANCEL,

	FORM_CHANGE_PASSWORD_SAVE,
	FORM_CHANGE_PASSWORD_CANCEL,

	FORM_BUS_SAVE,
	FORM_BUS_CANCEL,

	FORM_BUS_STOP_SAVE,
	FORM_BUS_STOP_CANCEL,
	FORM_BUS_STOP_ADD_POINT,
	FORM_BUS_STOP_EDIT_POINT,
	FORM_BUS_STOP_DELETE_POINT,

	FORM_BUS_STOP_PRINT_PRINT,
	FORM_BUS_STOP_PRINT_CANCEL,

	FORM_EMPLOYEE_SAVE,
	FORM_EMPLOYEE_RESET_PASSWORD,
	FORM_EMPLOYEE_CANCEL,

	FORM_TICKET_SAVE,
	FORM_TICKET_CANCEL,

	FORM_TOUR_EDIT_SAVE,
	FORM_TOUR_EDIT_CANCEL,

	FORM_ROUTE_BACK,
	FORM_ROUTE_NEXT,
	FORM_ROUTE_CANCEL,

	FORM_ROUTE_STEP1_UP,
	FORM_ROUTE_STEP1_DOWN,
	FORM_ROUTE_STEP1_ADD,
	FORM_ROUTE_STEP1_DELETE,

	FORM_ROUTE_STEP2_ADD,
	FORM_ROUTE_STEP2_EDIT,
	FORM_ROUTE_STEP2_DELETE,
	FORM_ROUTE_STEP2_DEPARTURE_SAVE,
	FORM_ROUTE_STEP2_DEPARTURE_CANCEL,

	TAB_BUS_NEW,
	TAB_BUS_EDIT,
	TAB_BUS_DELETE,

	TAB_EMPLOYEE_NEW,
	TAB_EMPLOYEE_EDIT,
	TAB_EMPLOYEE_DELETE,

	TAB_TICKET_NEW,
	TAB_TICKET_EDIT,
	TAB_TICKET_DELETE,

	TAB_BUS_STOP_NEW,
	TAB_BUS_STOP_EDIT,
	TAB_BUS_STOP_DELETE,
	TAB_BUS_STOP_PRINT,

	TAB_ROUTE_NEW,
	TAB_ROUTE_EDIT,
	TAB_ROUTE_DELETE,

	TAB_WORK_PLAN_PRINT,
	TAB_WORK_PLAN_EXPORT,

	TAB_SCHEDULE_EDIT,
	TAB_SCHEDULE_FILTER,

	DISPLAY_TICKET_BACK,

	DISPLAY_CONNECTION_SEARCH,
	DISPLAY_CONNECTION_EARLIER,
	DISPLAY_CONNECTION_FIRST,
	DISPLAY_CONNECTION_LATER,
	DISPLAY_CONNECTION_LAST,
	DISPLAY_CONNECTION_BACK,

	DISPLAY_NETWORK_DAY,
	DISPLAY_NETWORK_NIGHT,
	DISPLAY_NETWORK_BACK
}

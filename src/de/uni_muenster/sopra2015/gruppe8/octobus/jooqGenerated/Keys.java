/**
 * This class is generated by jOOQ
 */
package de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated;

/**
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> IDENTITY_BUSSTOPS = Identities0.IDENTITY_BUSSTOPS;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.Integer> IDENTITY_BUSSTOPS_STOPPINGPOINTS = Identities0.IDENTITY_BUSSTOPS_STOPPINGPOINTS;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord, java.lang.Integer> IDENTITY_BUSES = Identities0.IDENTITY_BUSES;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord, java.lang.Integer> IDENTITY_EMPLOYEES = Identities0.IDENTITY_EMPLOYEES;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord, java.lang.Integer> IDENTITY_ROUTES = Identities0.IDENTITY_ROUTES;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord, java.lang.Integer> IDENTITY_ROUTES_STARTTIMES = Identities0.IDENTITY_ROUTES_STARTTIMES;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, java.lang.Integer> IDENTITY_ROUTES_STOPS = Identities0.IDENTITY_ROUTES_STOPS;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.SoldticketsRecord, java.lang.Integer> IDENTITY_SOLDTICKETS = Identities0.IDENTITY_SOLDTICKETS;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.TicketsRecord, java.lang.Integer> IDENTITY_TICKETS = Identities0.IDENTITY_TICKETS;
	public static final org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, java.lang.Integer> IDENTITY_TOURS = Identities0.IDENTITY_TOURS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> PK_BUSSTOPS = UniqueKeys0.PK_BUSSTOPS;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> PK_BUSSTOPS_STOPPINGPOINTS = UniqueKeys0.PK_BUSSTOPS_STOPPINGPOINTS;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord> PK_BUSES = UniqueKeys0.PK_BUSES;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord> PK_EMPLOYEES = UniqueKeys0.PK_EMPLOYEES;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> PK_ROUTES = UniqueKeys0.PK_ROUTES;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord> PK_ROUTES_STARTTIMES = UniqueKeys0.PK_ROUTES_STARTTIMES;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord> PK_ROUTES_STOPS = UniqueKeys0.PK_ROUTES_STOPS;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.SoldticketsRecord> PK_SOLDTICKETS = UniqueKeys0.PK_SOLDTICKETS;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.TicketsRecord> PK_TICKETS = UniqueKeys0.PK_TICKETS;
	public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord> PK_TOURS = UniqueKeys0.PK_TOURS;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> FK_BUSSTOPS_STOPPINGPOINTS_BUSSTOPS_1 = ForeignKeys0.FK_BUSSTOPS_STOPPINGPOINTS_BUSSTOPS_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_ROUTES_STARTTIMES_ROUTES_1 = ForeignKeys0.FK_ROUTES_STARTTIMES_ROUTES_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_ROUTES_STOPS_ROUTES_1 = ForeignKeys0.FK_ROUTES_STOPS_ROUTES_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> FK_ROUTES_STOPS_BUSSTOPS_1 = ForeignKeys0.FK_ROUTES_STOPS_BUSSTOPS_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> FK_ROUTES_STOPS_BUSSTOPS_STOPPINGPOINTS_1 = ForeignKeys0.FK_ROUTES_STOPS_BUSSTOPS_STOPPINGPOINTS_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_TOURS_ROUTES_1 = ForeignKeys0.FK_TOURS_ROUTES_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord> FK_TOURS_BUSES_1 = ForeignKeys0.FK_TOURS_BUSES_1;
	public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord> FK_TOURS_EMPLOYEES_1 = ForeignKeys0.FK_TOURS_EMPLOYEES_1;

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> IDENTITY_BUSSTOPS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.BUSSTOPS_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.Integer> IDENTITY_BUSSTOPS_STOPPINGPOINTS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS.BUSSTOPS_STOPPINGPOINTS_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord, java.lang.Integer> IDENTITY_BUSES = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Buses.BUSES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Buses.BUSES.BUSES_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord, java.lang.Integer> IDENTITY_EMPLOYEES = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Employees.EMPLOYEES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Employees.EMPLOYEES.EMPLOYEES_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord, java.lang.Integer> IDENTITY_ROUTES = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Routes.ROUTES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Routes.ROUTES.ROUTES_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord, java.lang.Integer> IDENTITY_ROUTES_STARTTIMES = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES.ROUTES_STARTTIMES_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, java.lang.Integer> IDENTITY_ROUTES_STOPS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS.ROUTES_STOPS_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.SoldticketsRecord, java.lang.Integer> IDENTITY_SOLDTICKETS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Soldtickets.SOLDTICKETS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Soldtickets.SOLDTICKETS.SOLDTICKETS_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.TicketsRecord, java.lang.Integer> IDENTITY_TICKETS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.TICKETS_ID);
		public static org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, java.lang.Integer> IDENTITY_TOURS = createIdentity(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.TOURS_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> PK_BUSSTOPS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS.BUSSTOPS_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> PK_BUSSTOPS_STOPPINGPOINTS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS.BUSSTOPS_STOPPINGPOINTS_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord> PK_BUSES = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Buses.BUSES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Buses.BUSES.BUSES_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord> PK_EMPLOYEES = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Employees.EMPLOYEES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Employees.EMPLOYEES.EMPLOYEES_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> PK_ROUTES = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Routes.ROUTES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Routes.ROUTES.ROUTES_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord> PK_ROUTES_STARTTIMES = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES.ROUTES_STARTTIMES_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord> PK_ROUTES_STOPS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS.ROUTES_STOPS_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.SoldticketsRecord> PK_SOLDTICKETS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Soldtickets.SOLDTICKETS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Soldtickets.SOLDTICKETS.SOLDTICKETS_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.TicketsRecord> PK_TICKETS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tickets.TICKETS.TICKETS_ID);
		public static final org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord> PK_TOURS = createUniqueKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.TOURS_ID);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> FK_BUSSTOPS_STOPPINGPOINTS_BUSSTOPS_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS.BUSSTOPS_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStarttimesRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_ROUTES_STARTTIMES_ROUTES_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_ROUTES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStarttimes.ROUTES_STARTTIMES.ROUTES_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_ROUTES_STOPS_ROUTES_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_ROUTES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS.ROUTES_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> FK_ROUTES_STOPS_BUSSTOPS_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS.BUSSTOPS_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesStopsRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> FK_ROUTES_STOPS_BUSSTOPS_STOPPINGPOINTS_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS_STOPPINGPOINTS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.RoutesStops.ROUTES_STOPS.BUSSTOPS_STOPPINGPOINTS_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.RoutesRecord> FK_TOURS_ROUTES_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_ROUTES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.ROUTES_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusesRecord> FK_TOURS_BUSES_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.BUSES_ID);
		public static final org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.EmployeesRecord> FK_TOURS_EMPLOYEES_1 = createForeignKey(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_EMPLOYEES, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.EMPLOYEES_ID);
	}
}

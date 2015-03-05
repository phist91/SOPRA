/**
 * This class is generated by jOOQ
 */
package de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ToursRecord extends org.jooq.impl.UpdatableRecordImpl<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.ToursRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = 997166352;

	/**
	 * Setter for <code>tours.tours_id</code>.
	 */
	public void setToursId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>tours.tours_id</code>.
	 */
	public java.lang.Integer getToursId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>tours.timestamp</code>.
	 */
	public void setTimestamp(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>tours.timestamp</code>.
	 */
	public java.lang.Integer getTimestamp() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>tours.routes_id</code>.
	 */
	public void setRoutesId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>tours.routes_id</code>.
	 */
	public java.lang.Integer getRoutesId() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>tours.buses_id</code>.
	 */
	public void setBusesId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>tours.buses_id</code>.
	 */
	public java.lang.Integer getBusesId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>tours.employees_id</code>.
	 */
	public void setEmployeesId(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>tours.employees_id</code>.
	 */
	public java.lang.Integer getEmployeesId() {
		return (java.lang.Integer) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.TOURS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.ROUTES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.BUSES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS.EMPLOYEES_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getToursId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getTimestamp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getRoutesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getBusesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getEmployeesId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord value1(java.lang.Integer value) {
		setToursId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord value2(java.lang.Integer value) {
		setTimestamp(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord value3(java.lang.Integer value) {
		setRoutesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord value4(java.lang.Integer value) {
		setBusesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord value5(java.lang.Integer value) {
		setEmployeesId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ToursRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3, java.lang.Integer value4, java.lang.Integer value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ToursRecord
	 */
	public ToursRecord() {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS);
	}

	/**
	 * Create a detached, initialised ToursRecord
	 */
	public ToursRecord(java.lang.Integer toursId, java.lang.Integer timestamp, java.lang.Integer routesId, java.lang.Integer busesId, java.lang.Integer employeesId) {
		super(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Tours.TOURS);

		setValue(0, toursId);
		setValue(1, timestamp);
		setValue(2, routesId);
		setValue(3, busesId);
		setValue(4, employeesId);
	}
}
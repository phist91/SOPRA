/**
 * This class is generated by jOOQ
 */
package de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables;

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
public class Busstops extends org.jooq.impl.TableImpl<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> {

	private static final long serialVersionUID = -2102549885;

	/**
	 * The reference instance of <code>busStops</code>
	 */
	public static final de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops BUSSTOPS = new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> getRecordType() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord.class;
	}

	/**
	 * The column <code>busStops.busStops_id</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> BUSSTOPS_ID = createField("busStops_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>busStops.name</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.length(200), this, "");

	/**
	 * The column <code>busStops.locationX</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> LOCATIONX = createField("locationX", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>busStops.locationY</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> LOCATIONY = createField("locationY", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>busStops.barrierFree</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Boolean> BARRIERFREE = createField("barrierFree", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

	/**
	 * Create a <code>busStops</code> table reference
	 */
	public Busstops() {
		this("busStops", null);
	}

	/**
	 * Create an aliased <code>busStops</code> table reference
	 */
	public Busstops(java.lang.String alias) {
		this(alias, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops.BUSSTOPS);
	}

	private Busstops(java.lang.String alias, org.jooq.Table<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Busstops(java.lang.String alias, org.jooq.Table<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord, java.lang.Integer> getIdentity() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.IDENTITY_BUSSTOPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord> getPrimaryKey() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsRecord>>asList(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops as(java.lang.String alias) {
		return new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops rename(java.lang.String name) {
		return new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.Busstops(name, null);
	}
}

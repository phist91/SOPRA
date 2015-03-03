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
public class BusstopsStoppingpoints extends org.jooq.impl.TableImpl<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> {

	private static final long serialVersionUID = 1916218231;

	/**
	 * The reference instance of <code>busStops_stoppingPoints</code>
	 */
	public static final de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints BUSSTOPS_STOPPINGPOINTS = new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> getRecordType() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord.class;
	}

	/**
	 * The column <code>busStops_stoppingPoints.busStops_stoppingPoints_id</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.Integer> BUSSTOPS_STOPPINGPOINTS_ID = createField("busStops_stoppingPoints_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>busStops_stoppingPoints.busStops_id</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.Integer> BUSSTOPS_ID = createField("busStops_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>busStops_stoppingPoints.name</code>.
	 */
	public final org.jooq.TableField<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.length(200), this, "");

	/**
	 * Create a <code>busStops_stoppingPoints</code> table reference
	 */
	public BusstopsStoppingpoints() {
		this("busStops_stoppingPoints", null);
	}

	/**
	 * Create an aliased <code>busStops_stoppingPoints</code> table reference
	 */
	public BusstopsStoppingpoints(java.lang.String alias) {
		this(alias, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints.BUSSTOPS_STOPPINGPOINTS);
	}

	private BusstopsStoppingpoints(java.lang.String alias, org.jooq.Table<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> aliased) {
		this(alias, aliased, null);
	}

	private BusstopsStoppingpoints(java.lang.String alias, org.jooq.Table<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, java.lang.Integer> getIdentity() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.IDENTITY_BUSSTOPS_STOPPINGPOINTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord> getPrimaryKey() {
		return de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS_STOPPINGPOINTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord>>asList(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.PK_BUSSTOPS_STOPPINGPOINTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.records.BusstopsStoppingpointsRecord, ?>>asList(de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.Keys.FK_BUSSTOPS_STOPPINGPOINTS_BUSSTOPS_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints as(java.lang.String alias) {
		return new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints(alias, this);
	}

	/**
	 * Rename this table
	 */
	public de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints rename(java.lang.String name) {
		return new de.uni_muenster.sopra2015.gruppe8.octobus.jooqGenerated.tables.BusstopsStoppingpoints(name, null);
	}
}

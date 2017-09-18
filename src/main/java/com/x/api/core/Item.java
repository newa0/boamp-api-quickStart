package com.x.api.core;

/**
 * 
 * @author Emmanuel PESENTI
 *
 *         27 nov. 2016
 */
public final class Item {
	private String	id					= null;
	private String	value				= null;
	private String	schema			= null;
	private String	version			= null;
	private String	description	= null;
	private String	avis				= null;

	public Item() {
	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getValue() {
		return value;
	}

	public final void setValue(String value) {
		this.value = value;
	}

	public final String getSchema() {
		return schema;
	}

	public final void setSchema(String schema) {
		this.schema = schema;
		this.version = getVer(schema);
	}

	public final String getVersion() {
		return version;
	}

	public final String getDescription() {
		return description;
	}

	public final void setDescription(String description) {
		this.description = description;
	}

	public final String getAvis() {
		return avis;
	}

	public final void setAvis(String avis) {
		this.avis = avis;
	}

	private String getVer(String xsd) {
		int idx1 = xsd.indexOf("Boamp_");
		int idx2 = idx1 + "Boamp_".length();
		String ver = xsd.substring(idx2, idx2 + 4);
		return ver;
	}

	public boolean islocal() {
		if (avis != null)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		String local = "";
		if (islocal())
			local = " (en cache)";
		return String.format("Annonce - %12s - %s", getValue(), local);
	}

}
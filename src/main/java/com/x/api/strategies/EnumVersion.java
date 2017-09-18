package com.x.api.strategies;

public enum EnumVersion {
	v0("v010"),
	v1("v110"),
	v2("v230"),
	v3("v230");

	private final String value;

	EnumVersion(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static EnumVersion fromValue(String v) {
		for (EnumVersion c : EnumVersion.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}

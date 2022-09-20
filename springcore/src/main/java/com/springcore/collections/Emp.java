package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {

	private String name;

	private List<String> phones;

	private Set<String> addresses;

	private Map<String, String> cources;

	private Properties databaseConfig;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> cources,
			Properties databaseConfig) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.cources = cources;
		this.databaseConfig = databaseConfig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}

	public Map<String, String> getCources() {
		return cources;
	}

	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}

	public Properties getDatabaseConfig() {
		return databaseConfig;
	}

	public void setDatabaseConfig(Properties databaseConfig) {
		this.databaseConfig = databaseConfig;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", cources=" + cources
				+ ", databaseConfig=" + databaseConfig + "]";
	}

}

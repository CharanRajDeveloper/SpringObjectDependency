package com.objectdependency;

public class Address {
	private String city;
	private String state;
	private int postalCode;

	public Address(String city, String state, int postalCode) {
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}

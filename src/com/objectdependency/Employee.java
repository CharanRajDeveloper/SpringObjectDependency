package com.objectdependency;

public class Employee {
	Address address;
	
	public Employee(Address address) {
		this.address = address;
	}

	public void displayEmployeeInfo() {
		System.out.println(address.getCity()+":::"+address.getState()+":::"+address.getPostalCode());
	}

}

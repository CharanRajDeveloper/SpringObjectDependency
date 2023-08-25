package com.objectdependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Charan.xml");
		Employee emp=context.getBean("employee",Employee.class);
		emp.displayEmployeeInfo();
	}

}

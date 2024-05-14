package com.classAndObject;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContactNo;
	private String customerAddress;

	public Customer() {
		customerId = 1;
		customerName = "Ram";
		customerContactNo = 9823234929l;
		customerAddress = "Pune";
	}

	public void getCustomer() {
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContactNo);
		System.out.println(customerAddress);
	}

}
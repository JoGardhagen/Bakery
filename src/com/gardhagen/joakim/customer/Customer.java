package com.gardhagen.joakim.customer;

public class Customer {
	private String name;
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String string) {
		this.name = string;
	}

//	@Override
//	public void update(Message msg) {
//		System.out.println("Message is : " + msg.getMessage());
//		
//	}
}

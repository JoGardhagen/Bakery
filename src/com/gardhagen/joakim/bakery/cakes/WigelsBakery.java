package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

import com.gardhagen.joakim.customer.Customer;
import com.gardhagen.joakim.customer.Message;

public class WigelsBakery extends Bakery {
	Message msg = new Message();
	private List<Customer> customerList = new ArrayList<>();
	@Override
	Cakes createCake(String item) {
		if(item.equals("Princess Cake")) {
			msg.setMessage(item);
			return new princessCake();
		}
		if(item.equals("Shrovetide Bun")) {
			msg.setMessage(item);
			return new ShrovetideBun();
		}
		if(item.equals("Choclate Cake")) {
			msg.setMessage(item);
			return new ChoclateCake();
		}
		msg.setMessage(null);
		return null;	
	}
	public void printCustomerList() {
		for(Customer cust:customerList) {
			System.out.println(cust.getName());
		}
	}
	public void addCustomerToList(Customer customer) {
		customerList.add(customer);
	}
	

}

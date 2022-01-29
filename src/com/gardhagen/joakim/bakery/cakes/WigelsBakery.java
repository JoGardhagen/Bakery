package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

import com.gardhagen.joakim.customer.Customer;
import com.gardhagen.joakim.customer.Message;
import com.gardhagen.joakim.customer.Subject;

public class WigelsBakery extends Bakery implements Subject{
	Message msg = new Message(null);
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

	@Override
	public void attach(Customer o) {
		customerList.add(o);
		
	}

	@Override
	public void detach(Customer o) {
		customerList.remove(o);
		
	}

	@Override
	public void notifyUpdate(Message msg) {
		for(Customer c :customerList) {
			c.update(msg);
		}
		
	}

}

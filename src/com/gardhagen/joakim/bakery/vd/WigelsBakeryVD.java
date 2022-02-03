package com.gardhagen.joakim.bakery.vd;

import com.gardhagen.joakim.customer.Observer;

public class WigelsBakeryVD implements Observer{
	public String message = "";
	@Override
	public void update(String msg) {
		message = msg.toString(); 
		System.out.println("Update");
	}

}

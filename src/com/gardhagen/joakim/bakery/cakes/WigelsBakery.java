package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

import com.gardhagen.joakim.bakery.vd.WigelsBakeryVD;
import com.gardhagen.joakim.customer.Customer;
import com.gardhagen.joakim.customer.Subject;

public class WigelsBakery extends Bakery implements Subject {
//	Message msg = new Message();
	public WigelsBakeryVD VD =new WigelsBakeryVD();
	private List<Customer> customerList = new ArrayList<>(); 
	private List<WigelsBakeryVD> VdList = new ArrayList<>();
	
	@Override
	Cakes createCake(String item) {
		attach(VD);
		if(item.equals("Princess Cake")) {
//			msg.setMessage(item);
			
			return new princessCake();
		}
		if(item.equals("Shrovetide Bun")) {
//			msg.setMessage(item);
		
			return new ShrovetideBun();
		}
		if(item.equals("Choclate Cake")) {
//			msg.setMessage(item);
		
			return new ChoclateCake();
		}
//		msg.setMessage(null);
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
	@Override
	public void attach(WigelsBakeryVD o) {
		VdList.add(o);
		
	}
	@Override
	public void detach(WigelsBakeryVD o) {
		VdList.remove(o);
		
	}
	@Override
	public void notifyUpdate(String message) {
//		 this.cakeDone = message ;
		 for(WigelsBakeryVD vd : VdList) {
			 vd.update(message);
		 }
		
	}
	
	
	

}

package com.gardhagen.joakim.customer;



public interface Subject {
	
	public void attach(Customer o);
	public void detach(Customer o);
	public void notifyUpdate(Message m);
	
}

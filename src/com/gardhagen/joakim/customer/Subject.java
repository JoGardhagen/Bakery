package com.gardhagen.joakim.customer;

import com.gardhagen.joakim.bakery.vd.WigelsBakeryVD;

public interface Subject {
	
	public void attach(WigelsBakeryVD o);
	public void detach(WigelsBakeryVD o);
	public void notifyUpdate(String message);
	
}

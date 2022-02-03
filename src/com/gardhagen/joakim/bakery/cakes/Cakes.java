package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

public abstract class Cakes {// Denna klass ärvs av de 3 kakorna i programmet
	
	private boolean baked = false;  
	
	String name;
	List<String> ingredients = new ArrayList<>();

	public String getName() {
		return name;
	}
	public boolean isBaked() {
		return baked;
	}
	public void setBaked(boolean baked) {
		this.baked = baked;
	}
	
}

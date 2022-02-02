package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

public abstract class Cakes {
	
	private boolean baked = false;
	
	String name;
	List<String> ingredients = new ArrayList<>();
	
//	void prepare() {
//		System.out.println("Preparing "+name);
//		for(String ingridient : ingredients) {
//			System.out.println(" "+ ingridient);
//		}
//	}
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

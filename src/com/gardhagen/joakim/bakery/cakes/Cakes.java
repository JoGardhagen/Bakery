package com.gardhagen.joakim.bakery.cakes;

import java.util.ArrayList;
import java.util.List;

public abstract class Cakes {
	
	String name;
	List<String> ingredients = new ArrayList<>();
	
	void prepare() {
		System.out.println("Preparing "+name);
		for(String ingridient : ingredients) {
			System.out.println(" "+ ingridient);
		}
	}
	public String getName() {
		return name;
	}
	
}

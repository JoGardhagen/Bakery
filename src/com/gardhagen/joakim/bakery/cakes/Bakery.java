package com.gardhagen.joakim.bakery.cakes;

public abstract class Bakery {
	
	public Cakes orderCake(String type) {
		
		Cakes cake;
		cake = createCake(type);
		cake.prepare();
		return cake;
	}

	abstract Cakes createCake(String type);
}

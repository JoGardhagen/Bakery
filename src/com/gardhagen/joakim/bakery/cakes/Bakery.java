package com.gardhagen.joakim.bakery.cakes;

public abstract class Bakery {
	
	public Cakes orderCake(String type) {
		BakeingCake bake = new BakeingCake();
		Cakes cake;
		cake = createCake(type);
//		cake.prepare();
		
		bake.execute(cake);	
		if(cake.isBaked()==true) {
			return cake;
		}
		return null;
	}

	abstract Cakes createCake(String type);
}

package com.gardhagen.joakim.bakery.cakes;

public abstract class Bakery {// abstarct fabrik detta ärvs av WigelsBakery klassen
	
	public Cakes orderCake(String type) {
		BakeingCake bake = new BakeingCake();// instans för att baka en kaka 
		Cakes cake;
		cake = createCake(type);// väljer ut kaka som skall bakas
		
		bake.execute(cake);	// Anropar att exekvera kaka för att bakas 
		if(cake.isBaked()==true) {  // om han går igenom skpandet av Kakan i Commando mönstret retuneras kakan till main 
			return cake;
		}
		return null;
	}

	abstract Cakes createCake(String type);
}

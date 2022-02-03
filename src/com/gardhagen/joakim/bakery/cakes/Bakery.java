package com.gardhagen.joakim.bakery.cakes;

public abstract class Bakery {// abstarct fabrik detta �rvs av WigelsBakery klassen
	
	public Cakes orderCake(String type) {
		BakeingCake bake = new BakeingCake();// instans f�r att baka en kaka 
		Cakes cake;
		cake = createCake(type);// v�ljer ut kaka som skall bakas
		
		bake.execute(cake);	// Anropar att exekvera kaka f�r att bakas 
		if(cake.isBaked()==true) {  // om han g�r igenom skpandet av Kakan i Commando m�nstret retuneras kakan till main 
			return cake;
		}
		return null;
	}

	abstract Cakes createCake(String type);
}

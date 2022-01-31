package com.gardhagen.joakim.bakery.cakes;

public class BakeingCake implements Command {

	@Override
	public void execute(Cakes cake) {
		for(String item :cake.ingredients) {
			System.out.println("take out "+item + "prepareing to bake the "+cake.getName());
		}
		
	}

}

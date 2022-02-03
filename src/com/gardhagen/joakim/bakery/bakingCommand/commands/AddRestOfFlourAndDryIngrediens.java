package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class AddRestOfFlourAndDryIngrediens implements BakingCommand{ 
	String addRestOfFlourAndDryIngrediens = "Add 3dl flour, eggs, salt, cardamom and powdered sugar.\n"
			+ "Work the butter into the dough \n"
			+ "and leave to rise for 30 minutes.";
	
	@Override
	public String toString() {
		return " " + addRestOfFlourAndDryIngrediens + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(addRestOfFlourAndDryIngrediens);
		return null;
	}

}

package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class SprinkleADollopOfCream implements BakingCommand{
	String sprinkleADollopOfCream = "Sprinkle a dollop of cream on the almond paste. \n"
			+ "Put the lid back on and dust with icing sugar";
	
	@Override
	public String toString() {
		return " " + sprinkleADollopOfCream + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(sprinkleADollopOfCream);
		return null;
	}

}

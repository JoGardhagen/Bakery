package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class Bake225Degree implements BakingCommand {
	String bake225Degree = "Bake the buns for 8 minutes. Oven temperature 225 degrees";
	
	@Override
	public String toString() {
		return " " + bake225Degree + " ";
	}
 
	@Override
	public Cakes process(Cakes cake) {
		System.out.println(bake225Degree);
		return null;
	}

}

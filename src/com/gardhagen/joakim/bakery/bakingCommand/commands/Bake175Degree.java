package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class Bake175Degree implements BakingCommand{
	String bake175Degrees = "Bake for 20 mins, at 175 degrees";
	
	@Override
	public String toString() {
		return " " + bake175Degrees + " ";
	}

	@Override 
	public Cakes process(Cakes cake) {
		System.out.println(bake175Degrees);
		return null;
	}

}

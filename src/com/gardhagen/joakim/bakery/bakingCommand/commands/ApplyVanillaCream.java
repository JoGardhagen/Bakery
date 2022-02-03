package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class ApplyVanillaCream implements BakingCommand{
	String applyVanillaCream = "Apply layer of Vanilla Cream";
	
	@Override
	public String toString() {
		return " " + applyVanillaCream + " ";
	}

	@Override 
	public Cakes process(Cakes cake) {
		System.out.println(applyVanillaCream);
		return null;
	}

}

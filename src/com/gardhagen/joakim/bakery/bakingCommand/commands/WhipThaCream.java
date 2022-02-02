package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class WhipThaCream implements BakingCommand{
	String whipThaCream = "Whiping the Cream";

	@Override
	public String toString() {
		return " " + whipThaCream + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(whipThaCream);
		return null;
	}
}

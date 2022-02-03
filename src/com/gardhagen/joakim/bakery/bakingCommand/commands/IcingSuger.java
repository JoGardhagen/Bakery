package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class IcingSuger implements BakingCommand{
	String icingSuger = "Granulate with icing sugar";
	@Override
	public String toString() {
		return " " + icingSuger + " ";
	}
	@Override 
	public Cakes process(Cakes cake) {
		System.out.println(icingSuger);
		return null;
	}

}

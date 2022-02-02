package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class PrepareMilkAndGeast implements BakingCommand{
	String preapareMilkAndGeast = " Warm up the milk, tear apart the geast in a bowl,\n"
			+ "Pour in the milk and stir. Add 4 dl wheat flour.\n"
			+ " Mix and let rest for about 15 minutes";
	
	@Override
	public String toString() {
		return " " + preapareMilkAndGeast + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(preapareMilkAndGeast);
		return null;
	}
	

}

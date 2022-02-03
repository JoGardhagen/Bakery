package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class PrepareDough implements BakingCommand{ 
	String prepareDough = "Divide the dough into 12 pieces and shape into smooth buns.\n"
			+ "Let ferment for about 90 minutes";
	
	@Override
	public String toString() {
		return " " + prepareDough + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(prepareDough);
		return null;
	}

}

package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class PrepareCakeBase implements BakingCommand{
	String prepareCakeBase = "Preparing Cake Base";
	@Override
	public String toString() {
		return " " + prepareCakeBase + " ";
	}
	@Override 
	public Cakes process(Cakes cake) {
		System.out.println(prepareCakeBase);
		return null;
	}

}

package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class BatterInMold implements BakingCommand{
	String batterInMold = "Pour the batter into a mold";
	
	@Override
	public String toString() {
		return " " + batterInMold + " ";
	}

	@Override
	public Cakes process(Cakes cake) { 
		System.out.println(batterInMold);
		return null;
	}

}

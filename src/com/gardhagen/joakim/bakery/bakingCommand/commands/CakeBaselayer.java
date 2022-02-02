package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class CakeBaselayer implements BakingCommand{
	String applyCakelayer = "Apply a Cake base layer";
	
	
	@Override
	public String toString() {
		return " " + applyCakelayer + " ";
	}


	@Override
	public Cakes process(Cakes cake) {
		System.out.println(applyCakelayer);
		return null;
	}

}

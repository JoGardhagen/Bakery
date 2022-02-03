package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class AddMeltedButter implements BakingCommand{ 
	String addMeltedButter = "Add the melted butter to the mix";
	
	@Override
	public String toString() {
		return " " + addMeltedButter + " "; 
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(addMeltedButter);
		return null;
	}

}

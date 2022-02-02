package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class CutBuns implements BakingCommand{
	String cutBuns = "Cut off a lid on each bun. \n"
			+ "Dig out the bun a little and fill with almond paste";
	
	@Override
	public String toString() {
		return " " + cutBuns + " ";
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(cutBuns);
		return null;
	}

}

package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class MeltButter implements BakingCommand {
	String meltButter = "Melting Butter";
	@Override
	public String toString() {
		return " " + meltButter + " ";
	}
	@Override
	public Cakes process(Cakes cake) {
		System.out.println(meltButter);
		return null;
	}
	
	

}

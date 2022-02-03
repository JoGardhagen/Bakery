package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class MarzipanRose implements BakingCommand {
	String marzipanRose ="Apply Marzipan rose";
	
	@Override
	public String toString() {
		return " " + marzipanRose + " "; 
	} 

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(marzipanRose);
		return null;
	}

}

package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class ApplyMarzipanTop implements BakingCommand{
	String applyMarzipanTop = "Apply Marzinpan top";
	
	@Override
	public String toString() {
		return " " + applyMarzipanTop + " ";
	} 

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(applyMarzipanTop);
		return null;
	}

}

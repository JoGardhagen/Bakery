package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class ApplyRaspberryJam implements BakingCommand{
	String applyRaspberryJam = "Apply layer of Raspberry Jam";
	
	@Override
	public String toString() {
		return " " + applyRaspberryJam + " "; 
	}
	@Override
	public Cakes process(Cakes cake) {
		System.out.println(applyRaspberryJam);
		return null;
	}
	

}

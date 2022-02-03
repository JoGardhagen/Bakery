package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class PortionOutWhippedCream implements BakingCommand{
	String portionOutWhippedCream = "Portion out the whipped cream";
	
	@Override
	public String toString() {
		return " " + portionOutWhippedCream + " ";
	}
 
	@Override
	public Cakes process(Cakes cake) {
		System.out.println(portionOutWhippedCream);
		return null;
	}
	
}

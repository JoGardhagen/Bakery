package com.gardhagen.joakim.bakery.bakingCommand.commands;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;

public class MixDryIngredients implements BakingCommand{
	String mixDryIngredients = "Mix Suger,Egg,Flour,Cacao,Vanilla Suger and salt";
	
	@Override
	public String toString() {
		return " " + mixDryIngredients + " ";
	} 

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(mixDryIngredients);
		return null;
	}

}

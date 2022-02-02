package com.gardhagen.joakim.bakery.bakingCommand;

import java.util.ArrayList;
import java.util.List;

import com.gardhagen.joakim.bakery.cakes.Cakes;

public class BakingPipeline {
	private List<BakingCommand> pipeline = new ArrayList<>();
	
	public void addCommand(BakingCommand command) {
		pipeline.add(command);
	}
	public Cakes execute(Cakes cake) {
		Cakes result = cake;
		for(BakingCommand command : pipeline) {
			result = command.process(result);
		}
		return result;
	}
}

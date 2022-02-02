package com.gardhagen.joakim.bakery.cakes;

import com.gardhagen.joakim.bakery.bakingCommand.BakingPipeline;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyRaspberryJam;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyVanillaCream;
import com.gardhagen.joakim.bakery.bakingCommand.commands.IcingSuger;
import com.gardhagen.joakim.bakery.bakingCommand.commands.MeltButter;
import com.gardhagen.joakim.bakery.bakingCommand.commands.PrepareCakeBase;
import com.gardhagen.joakim.bakery.bakingCommand.commands.WhipThaCream;

public class BakeingCake implements Command {

	@Override
	public void execute(Cakes cake) {
		boolean done = false;
		BakingPipeline baking = new BakingPipeline();
			do {for (String item : cake.ingredients) {
				if(item.contentEquals("Whiped Cream")) {
					baking.addCommand(new WhipThaCream());
				}
				if (item.contentEquals("Butter")) {
					baking.addCommand(new MeltButter());
				}
				if (item.contentEquals("Cake Base")) {
					baking.addCommand(new PrepareCakeBase());
				}
				if(item.contentEquals("Raspberry Jam")) {
					baking.addCommand(new ApplyRaspberryJam());
				}
				if(item.contentEquals("Vanilla Cream")) {
					baking.addCommand(new ApplyVanillaCream());
				}
				if (item.contentEquals("Icing Suger")) {
					baking.addCommand(new IcingSuger());
					done = true;
				}
			}
			} while (done!=true);
			baking.execute(cake);
			cake.setBaked(true);
		}
		
	}



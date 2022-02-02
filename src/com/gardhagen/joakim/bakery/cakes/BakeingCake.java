package com.gardhagen.joakim.bakery.cakes;

import com.gardhagen.joakim.bakery.bakingCommand.BakingPipeline;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyRaspberryJam;
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
//					System.out.println("Melting Butter");
					baking.addCommand(new MeltButter());
				}
				if (item.contentEquals("Cake Base")) {
//					System.out.println("Prepare the Cake Base");
					baking.addCommand(new PrepareCakeBase());
				}
				if(item.contentEquals("Raspberry Jam")) {
					baking.addCommand(new ApplyRaspberryJam());
//					System.out.println("Apply layer of Raspberry Jam");
//					System.out.println("Apply Cake Base layer");
				}
				if(item.contentEquals("Vanilla Cream")) {
					System.out.println("Apply layer of Vanilla Cream");
				}

				if (item.contentEquals("Icing Suger")) {
					System.out.println("Granulate with icing sugar");
					done = true;
				}
			}
			} while (done!=true);
			baking.execute(cake);
			cake.setBaked(true);
		}
		
	}



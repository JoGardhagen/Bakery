package com.gardhagen.joakim.bakery.cakes;

import com.gardhagen.joakim.bakery.bakingCommand.BakingPipeline;
import com.gardhagen.joakim.bakery.bakingCommand.commands.AddMeltedButter;
import com.gardhagen.joakim.bakery.bakingCommand.commands.AddRestOfFlourAndDryIngrediens;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyMarzipanTop;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyRaspberryJam;
import com.gardhagen.joakim.bakery.bakingCommand.commands.ApplyVanillaCream;
import com.gardhagen.joakim.bakery.bakingCommand.commands.Bake175Degree;
import com.gardhagen.joakim.bakery.bakingCommand.commands.BatterInMold;
import com.gardhagen.joakim.bakery.bakingCommand.commands.CakeBaselayer;
import com.gardhagen.joakim.bakery.bakingCommand.commands.CutBuns;
import com.gardhagen.joakim.bakery.bakingCommand.commands.IcingSuger;
import com.gardhagen.joakim.bakery.bakingCommand.commands.MarzipanRose;
import com.gardhagen.joakim.bakery.bakingCommand.commands.MeltButter;
import com.gardhagen.joakim.bakery.bakingCommand.commands.MixDryIngredients;
import com.gardhagen.joakim.bakery.bakingCommand.commands.PortionOutWhippedCream;
import com.gardhagen.joakim.bakery.bakingCommand.commands.PrepareCakeBase;
import com.gardhagen.joakim.bakery.bakingCommand.commands.PrepareDough;
import com.gardhagen.joakim.bakery.bakingCommand.commands.PrepareMilkAndGeast;
import com.gardhagen.joakim.bakery.bakingCommand.commands.SprinkleADollopOfCream;
import com.gardhagen.joakim.bakery.bakingCommand.commands.WhipThaCream;

public class BakeingCake implements Command{
	@Override 
	public void execute(Cakes cake) {
		
		BakingPipeline baking = new BakingPipeline();// instans till baknings commado Pipeline, f?r att l?gg till commandon
		
		if(cake.name.equals("Princess Cake")) {// l?gger till commandon f?r PrinsessT?rtan
			baking.addCommand(new WhipThaCream());
			baking.addCommand(new PrepareCakeBase());
			baking.addCommand(new ApplyRaspberryJam());
			baking.addCommand(new CakeBaselayer());
			baking.addCommand(new ApplyVanillaCream());
			baking.addCommand(new PortionOutWhippedCream()); 
			baking.addCommand(new ApplyMarzipanTop());
			baking.addCommand(new MarzipanRose());
			baking.addCommand(new IcingSuger());
		}
		if(cake.name.equals("Choclate Cake")) {// l?gger till commandon f?r Kladdkakan
			baking.addCommand(new MeltButter());
			baking.addCommand(new MixDryIngredients());
			baking.addCommand(new AddMeltedButter());
			baking.addCommand(new BatterInMold());
			baking.addCommand(new Bake175Degree());
		}
		if(cake.name.equals("Shrovetide Bun")) {// l?gger till commandon f?r Semla
			baking.addCommand(new PrepareMilkAndGeast());
			baking.addCommand(new AddRestOfFlourAndDryIngrediens());
			baking.addCommand(new PrepareDough());
			baking.addCommand(new CutBuns());
			baking.addCommand(new SprinkleADollopOfCream());
		}
			baking.execute(cake);// utf?r commmandona fr?n Pipelinen en efter en som lagt till i listan
			cake.setBaked(true);// sist s?tts kakan som klar men cake is baked = true
		}
		
	}



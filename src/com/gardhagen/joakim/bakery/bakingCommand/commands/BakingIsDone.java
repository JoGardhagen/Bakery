package com.gardhagen.joakim.bakery.bakingCommand.commands;

import java.util.ArrayList;
import java.util.List;

import com.gardhagen.joakim.bakery.bakingCommand.BakingCommand;
import com.gardhagen.joakim.bakery.cakes.Cakes;
import com.gardhagen.joakim.bakery.vd.WigelsBakeryVD;
import com.gardhagen.joakim.customer.Subject;

public class BakingIsDone implements BakingCommand, Subject{
	private List<WigelsBakeryVD> VdList = new ArrayList<>();
	String cakeDone = "Cake is now done,";
	

	@Override
	public void attach(WigelsBakeryVD o) {
		VdList.add(o);
		
	}

	@Override 
	public void detach(WigelsBakeryVD o) {
		VdList.remove(o);
		
	}

	@Override
	public Cakes process(Cakes cake) {
		System.out.println(cake.getName()+" "+cakeDone);
		return null;
	}

	@Override
	public void notifyUpdate(String message) {
		message = this.cakeDone;
		
	}

}

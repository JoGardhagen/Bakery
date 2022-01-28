package com.gardhagen.joakim.bakery.cakes;

public class WigelsBakery extends Bakery{

	@Override
	Cakes createCake(String item) {
		if(item.equals("Princess Cake")) {
			return new princessCake();
		}
		if(item.equals("Shrovetide Bun")) {
			return new ShrovetideBun();
		}
		if(item.equals("Choclate Cake"))
			return new ChoclateCake();
		return null;
			
	}

}

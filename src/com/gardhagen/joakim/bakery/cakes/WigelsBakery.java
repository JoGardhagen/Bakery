package com.gardhagen.joakim.bakery.cakes;

public class WigelsBakery extends Bakery{

	@Override
	Cakes createCake(String item) {
		
		return new princessCake();
	}

}

package com.gardhagen.joakim.bakery.bakingCommand;

import com.gardhagen.joakim.bakery.cakes.Cakes;

public interface BakingCommand {
	Cakes process(Cakes cake);
}

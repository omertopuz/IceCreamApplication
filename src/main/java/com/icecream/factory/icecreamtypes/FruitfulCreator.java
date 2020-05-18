package com.icecream.factory.icecreamtypes;

import com.icecream.factory.IceCreamTypeCreator;
import com.icecream.models.AbstractIceCream;
import com.icecream.models.Fruitee;
import com.icecream.models.IceCreamStyle;
import com.icecream.models.types.Fruitful;

public class FruitfulCreator implements IceCreamTypeCreator {

	private Fruitee fruitType;
	
	public FruitfulCreator(Fruitee fruitType) {
		this.fruitType = fruitType;
	}
	
	@Override
	public AbstractIceCream createIceCreamScoop(IceCreamStyle style) {
		return new Fruitful(style,fruitType);
	}
}

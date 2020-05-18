package com.icecream.builders;

import com.icecream.factory.icecreamtypes.EnumFruitTypes;
import com.icecream.models.styles.Maras;

public class StyleMarasIceCreamBuilder extends AbstractIceCreamBuilder {

	@Override
	public void style() {
		iceCreamStyle = new Maras();
	}

	@Override
	public IceCreamBuilder putFruitful(int tupleCount, EnumFruitTypes fruitType) {
		throw new IllegalArgumentException("Maras style does not accept fruitful type");
	}

}

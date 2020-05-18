package com.icecream.factory.icecreamtypes;

import com.icecream.factory.IceCreamTypeCreator;
import com.icecream.models.AbstractIceCream;
import com.icecream.models.IceCreamStyle;
import com.icecream.models.types.Chocolate;

public class ChocolateCreator implements IceCreamTypeCreator {

	@Override
	public AbstractIceCream createIceCreamScoop(IceCreamStyle style) {
		return new Chocolate(style);
	}

}

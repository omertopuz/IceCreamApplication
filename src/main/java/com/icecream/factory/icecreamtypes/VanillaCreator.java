package com.icecream.factory.icecreamtypes;

import com.icecream.factory.IceCreamTypeCreator;
import com.icecream.models.AbstractIceCream;
import com.icecream.models.IceCreamStyle;
import com.icecream.models.types.Vanilla;

public class VanillaCreator implements IceCreamTypeCreator {

	@Override
	public AbstractIceCream createIceCreamScoop(IceCreamStyle style) {
		return new Vanilla(style);
	}

}

package com.icecream.models.styles;

import com.icecream.models.IceCreamStyle;

public class Homemade implements IceCreamStyle {

	@Override
	public String getStyle() {
		return "Homemade";
	}

	@Override
	public String getInfo() {
		return "Natural and pure ...";
	}

}

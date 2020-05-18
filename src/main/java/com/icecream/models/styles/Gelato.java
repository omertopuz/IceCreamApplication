package com.icecream.models.styles;

import com.icecream.models.IceCreamStyle;

public class Gelato implements IceCreamStyle {

	@Override
	public String getStyle() {
		return "Gelato";
	}

	@Override
	public String getInfo() {
		return "Italian style ice cream ...";
	}

	
}

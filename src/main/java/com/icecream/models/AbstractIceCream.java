package com.icecream.models;

public abstract class AbstractIceCream implements IceCreamType {
	private IceCreamStyle style;
	public AbstractIceCream(IceCreamStyle style) {
		this.style = style;
	}
	@Override
	public Double getPrice() {
		return 5.0;
	}
}

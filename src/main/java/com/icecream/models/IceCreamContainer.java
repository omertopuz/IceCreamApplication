package com.icecream.models;

import java.util.List;

public abstract class IceCreamContainer implements Costable {
	protected List<AbstractIceCream> iceCreamScoops;

	public List<AbstractIceCream> getIceCreamScoops() {
		return iceCreamScoops;
	}

	public void setIceCreamScoops(List<AbstractIceCream> iceCreamScoops) {
		this.iceCreamScoops = iceCreamScoops;
	}
	
	@Override
	public Double getPrice() {
		return 2.5;
	}
}

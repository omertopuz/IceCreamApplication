package com.icecream.decorator;

import com.icecream.builders.IceCream;

/**
 * @author Ömer TOPUZ
 * An implementation of Decorator design pattern
 * This class decorate the IceCream object
 * */

public class ChocolateSaucedIceCream implements IceCream {
	private IceCream iceCream;
	public ChocolateSaucedIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	@Override
	public void presentIceCream() {
		pourChocolateSauce();
		iceCream.presentIceCream();
	}
	
	private void pourChocolateSauce() {
		System.out.println("Added Chocolate sauce");
	}
}

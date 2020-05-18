package com.icecream.decorator;

import com.icecream.builders.IceCream;

/**
 * @author Ömer TOPUZ
 * An implementation of Decorator design pattern
 * This class decorate the IceCream object
 * */
public class HazelnutIceCream implements IceCream {
	private IceCream iceCream;
	public HazelnutIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}
	@Override
	public void presentIceCream() {
		dustHazelnuts();
		iceCream.presentIceCream();
	}
	
	private void dustHazelnuts() {
		System.out.println("Added Hazelnuts");
	}
}

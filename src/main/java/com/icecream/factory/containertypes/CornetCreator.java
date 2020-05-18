package com.icecream.factory.containertypes;

import com.icecream.factory.IceCreamContainerCreator;
import com.icecream.models.IceCreamContainer;
import com.icecream.models.containers.Cone;

/**
 * @author Ömer TOPUZ
 * Singleton design pattern
 * */
public class CornetCreator implements IceCreamContainerCreator {

	private CornetCreator() {
	}
	
	private static final CornetCreator instance = new CornetCreator();
	
	public static CornetCreator getInstance() {
		return instance;
	}
	
	@Override
	public IceCreamContainer createIceCreamContainer() {
		return new Cone();
	}

}

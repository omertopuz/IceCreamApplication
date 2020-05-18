package com.icecream.factory.containertypes;

import com.icecream.factory.IceCreamContainerCreator;
import com.icecream.models.IceCreamContainer;
import com.icecream.models.containers.Bowl;

/**
 * @author Ömer TOPUZ
 * Singleton design pattern
 * */
public class BowlCreator implements IceCreamContainerCreator {

	private BowlCreator() {
		
	}
	
	private static final BowlCreator instance = new BowlCreator();
	
	public static BowlCreator getInstance() {
		return instance;
	}
	
	@Override
	public IceCreamContainer createIceCreamContainer() {
		return new Bowl();
	}

}

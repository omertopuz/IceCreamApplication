package com.icecream.factory.containertypes;

import com.icecream.factory.IceCreamContainerCreator;
import com.icecream.models.IceCreamContainer;
import com.icecream.models.containers.Cone;
import com.icecream.models.containers.Cornet;

/**
 * @author Ömer TOPUZ
 * Singleton design pattern
 * */
public class ConeCreator implements IceCreamContainerCreator {

	private ConeCreator() {
	}
	
	private static final ConeCreator instance = new ConeCreator();
	
	public static ConeCreator getInstance() {
		return instance;
	}
	
	@Override
	public IceCreamContainer createIceCreamContainer() {
		return new Cornet();
	}

}

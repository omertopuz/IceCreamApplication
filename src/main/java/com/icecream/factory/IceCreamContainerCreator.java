package com.icecream.factory;

import com.icecream.models.IceCreamContainer;

/**
 * @author Ömer TOPUZ
 * Interface for Factory Method design pattern
 * This factory will create Cornet, Cone or Bowl
 * */

public interface IceCreamContainerCreator {
	
	public abstract IceCreamContainer createIceCreamContainer();
}

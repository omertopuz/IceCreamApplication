package com.icecream.factory;

import com.icecream.models.AbstractIceCream;
import com.icecream.models.IceCreamStyle;

/**
 * @author Ömer TOPUZ
 * Interface for Factory Method design pattern to create IceCreamType
 * This factory will create Vanilla, Chocolate or Fruitful
 * */
public interface IceCreamTypeCreator {
	AbstractIceCream createIceCreamScoop(IceCreamStyle style);
}

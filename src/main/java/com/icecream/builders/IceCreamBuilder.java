package com.icecream.builders;

import com.icecream.factory.icecreamtypes.EnumFruitTypes;

/**
 * @author Ömer TOPUZ
 * Interface for Builder design pattern to build up the IceCreamProduct
 * */

public interface IceCreamBuilder {

	void style();
	
	IceCreamBuilder containerCone() ;

	IceCreamBuilder containerCornet() ;

	IceCreamBuilder containerBowl();
	
	IceCreamBuilder putVanilla(int tupleCount) ;

	IceCreamBuilder putChocolate(int tupleCount) ;

	IceCreamBuilder putFruitful(int tupleCount, EnumFruitTypes fruitType);
	
	IceCreamProduct build();
}

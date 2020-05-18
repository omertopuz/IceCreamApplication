package com.icecream.requests;

import com.icecream.builders.IceCreamBuilder;
import com.icecream.factory.icecreamtypes.EnumFruitTypes;

public enum EnumIceCreamTypes {
	VANILLA  (1),
	CHOCOLATE(2),
    FRUITFUL (3);


	public IceCreamBuilder setIceCreamTypeObject(IceCreamBuilder builder, int tupleCount,EnumFruitTypes fruitType) {
    	switch (this) {
		case VANILLA:
			return builder.putVanilla(tupleCount);
		case CHOCOLATE:
			return builder.putChocolate(tupleCount);
		case FRUITFUL:
			return builder.putFruitful(tupleCount, fruitType);
		default:
			throw new IllegalArgumentException("Choose container type");
		}
    }

    private final int icecreamTypeCode;

    private EnumIceCreamTypes(int typeCode) {
        this.icecreamTypeCode = typeCode;
    }
}

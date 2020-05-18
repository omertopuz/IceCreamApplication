package com.icecream.requests;

import com.icecream.builders.IceCreamBuilder;
import com.icecream.factory.IceCreamContainerCreator;
import com.icecream.factory.containertypes.BowlCreator;
import com.icecream.factory.containertypes.ConeCreator;
import com.icecream.factory.containertypes.CornetCreator;

public enum EnumContainerTypes {
	CONE  (1),
	CORNET(2),
    BOWL (3);

	public IceCreamBuilder setContainerTypeObject(IceCreamBuilder builder) {
    	switch (this) {
		case CONE:
			return builder.containerCone();
		case CORNET:
			return builder.containerCornet();
		case BOWL:
			return builder.containerBowl();
		default:
			throw new IllegalArgumentException("Choose container type");
		}
    }

    private final int containerTypeCode;

    private EnumContainerTypes(int typeCode) {
        this.containerTypeCode = typeCode;
    }
}

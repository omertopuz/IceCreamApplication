package com.icecream.requests;

import com.icecream.builders.AbstractIceCreamBuilder.IceCreamProductBuilder;
import com.icecream.builders.IceCreamBuilder;

public enum EnumIceCreamStyles {
	GELATO  (1),
	MARAS(2),
    HOMEMADE (3);

	
	public IceCreamBuilder setIceCreamStyleType(IceCreamProductBuilder builder) {
    	switch (this) {
		case GELATO:
			return builder.styleGelato();
		case MARAS:
			return builder.styleMaras();
		case HOMEMADE:
			return builder.styleHomeMade();
		default:
			throw new IllegalArgumentException("Choose style");
		}
    }

    private final int styleTypeCode;

    private EnumIceCreamStyles(int typeCode) {
        this.styleTypeCode = typeCode;
    }
}

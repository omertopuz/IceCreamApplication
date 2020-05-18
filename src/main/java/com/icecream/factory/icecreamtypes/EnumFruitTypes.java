package com.icecream.factory.icecreamtypes;

import com.icecream.models.Fruitee;
import com.icecream.models.types.fruitfuls.Banana;
import com.icecream.models.types.fruitfuls.Lemon;
import com.icecream.models.types.fruitfuls.Strawberry;

public enum EnumFruitTypes {
	BANANA  (1),
    STRAWBERRY(2),
    LEMON (3);

	public Fruitee getFruitTypeObject() {
    	switch (this) {
		case BANANA:
			return new Banana();
		case STRAWBERRY:
			return new Strawberry();
		case LEMON:
			return new Lemon();
		default:
			throw new IllegalArgumentException("Choose fruit type");
		}
    }

    private final int fruitTypeCode;

    private EnumFruitTypes(int typeCode) {
        this.fruitTypeCode = typeCode;
    }
}

package com.icecream.requests;

import com.icecream.factory.icecreamtypes.EnumFruitTypes;
import com.icecream.models.IceCreamType;

public class IceCreamScootModel {
	
	private int scootCount;
	private EnumIceCreamTypes iceCreamType;
	private EnumFruitTypes fruitTypes;
	private EnumIceCreamStyles iceCreamStyle;
	public IceCreamScootModel(int scootCount, EnumIceCreamTypes iceCreamType, EnumFruitTypes fruitTypes) {
		super();
		this.scootCount = scootCount;
		this.iceCreamType = iceCreamType;
		this.fruitTypes = fruitTypes;
	}
	
	public IceCreamScootModel() {
		// TODO Auto-generated constructor stub
	}

	public int getScootCount() {
		return scootCount;
	}

	public void setScootCount(int scootCount) {
		this.scootCount = scootCount;
	}

	public EnumIceCreamTypes getIceCreamType() {
		return iceCreamType;
	}

	public void setIceCreamType(EnumIceCreamTypes iceCreamType) {
		this.iceCreamType = iceCreamType;
	}

	public EnumFruitTypes getFruitTypes() {
		return fruitTypes;
	}

	public void setFruitTypes(EnumFruitTypes fruitTypes) {
		this.fruitTypes = fruitTypes;
	}

	public EnumIceCreamStyles getIceCreamStyle() {
		return iceCreamStyle;
	}

	public void setIceCreamStyle(EnumIceCreamStyles iceCreamStyle) {
		this.iceCreamStyle = iceCreamStyle;
	}
	
	
}

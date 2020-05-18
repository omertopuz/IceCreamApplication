package com.icecream.builders;

import java.util.ArrayList;
import java.util.List;

import com.icecream.factory.IceCreamContainerCreator;
import com.icecream.factory.IceCreamTypeCreator;
import com.icecream.factory.containertypes.BowlCreator;
import com.icecream.factory.containertypes.ConeCreator;
import com.icecream.factory.containertypes.CornetCreator;
import com.icecream.factory.icecreamtypes.ChocolateCreator;
import com.icecream.factory.icecreamtypes.EnumFruitTypes;
import com.icecream.factory.icecreamtypes.FruitfulCreator;
import com.icecream.factory.icecreamtypes.VanillaCreator;
import com.icecream.models.AbstractIceCream;
import com.icecream.models.IceCreamContainer;
import com.icecream.models.IceCreamStyle;

/**
 * @author Ömer TOPUZ
 * Implementation of Builder design pattern to build up the IceCreamProduct
 * */

public abstract class AbstractIceCreamBuilder implements IceCreamBuilder {
	protected List<AbstractIceCream> iceCreamScoots;
	protected IceCreamProduct iceCreamCompleted;
	protected IceCreamContainer iceCreamContainer;
	protected IceCreamStyle iceCreamStyle;
	
	public AbstractIceCreamBuilder() {
		iceCreamScoots = new ArrayList<AbstractIceCream>();
		style();
	}
	
	@Override
	public IceCreamBuilder containerCone() {
		IceCreamContainerCreator iceCreamContainerCreator = ConeCreator.getInstance();
		iceCreamContainer = iceCreamContainerCreator.createIceCreamContainer();
		System.out.println("container type : Cone");
		return this;
	}

	public IceCreamBuilder containerCornet() {
		IceCreamContainerCreator iceCreamContainerCreator = CornetCreator.getInstance();
		iceCreamContainer = iceCreamContainerCreator.createIceCreamContainer();
		System.out.println("container type : Cornet");
		return this;
	}

	public IceCreamBuilder containerBowl() {
		IceCreamContainerCreator iceCreamContainerCreator = BowlCreator.getInstance();
		iceCreamContainer = iceCreamContainerCreator.createIceCreamContainer();
		System.out.println("container type : Bowl");
		return this;
	}
	
	public IceCreamProduct build() {
		if (iceCreamContainer == null)
			throw new IllegalArgumentException("Create IceCreamContainer in order to put icecream scoots.");

		if (iceCreamScoots.size() == 0)
			throw new IllegalArgumentException("empty container, no ice cream scoots contained.");

		System.out.println("Totally, put " + iceCreamScoots.size() + " scoop ice cream.");
		System.out.println(iceCreamStyle.getInfo());
		iceCreamContainer.setIceCreamScoops(iceCreamScoots);
		this.iceCreamCompleted = new IceCreamProduct(iceCreamContainer);
		
		return this.iceCreamCompleted;
	}	
	
	@Override
	public IceCreamBuilder putVanilla(int tupleCount) {
		if (tupleCount > 0) {
			System.out.println("put " + tupleCount + " scoops of Vanilla");
			IceCreamTypeCreator iceCreamTypeCreator = new VanillaCreator();
			while (tupleCount-- > 0) {
				iceCreamScoots.add(iceCreamTypeCreator.createIceCreamScoop(iceCreamStyle));
			}
		}
		return this;
	}

	@Override
	public IceCreamBuilder putChocolate(int tupleCount) {
		if (tupleCount > 0) {
			System.out.println("put " + tupleCount + " scoops of Chocolate");
			IceCreamTypeCreator iceCreamTypeCreator = new ChocolateCreator();
			while (tupleCount-- > 0) {
				iceCreamScoots.add(iceCreamTypeCreator.createIceCreamScoop(iceCreamStyle));
			}
		}
		return this;
	}

	@Override
	public IceCreamBuilder putFruitful(int tupleCount, EnumFruitTypes fruitType) {
		if (tupleCount > 0) {
			IceCreamTypeCreator iceCreamTypeCreator = new FruitfulCreator(fruitType.getFruitTypeObject());
			System.out.println("put " + tupleCount + " scoops of " + fruitType.name());
			while (tupleCount-- > 0) {
				iceCreamScoots.add(iceCreamTypeCreator.createIceCreamScoop(iceCreamStyle));
			}
		}
		return this;
	}
	
	public static IceCreamProductBuilder getIceCreamBuilder() {
		return new IceCreamProductBuilder();
	}

	/**
	 * @author Ömer TOPUZ
	 * Builder class
	 * also it is an implementation of Visitor design pattern in the sense that there exists distinct Builder for each style
	 * */
	public static class IceCreamProductBuilder{
		public StyleGelatoIceCreamBuilder styleGelato() {
			return new StyleGelatoIceCreamBuilder();
		}

		public StyleMarasIceCreamBuilder styleMaras() {
			return new StyleMarasIceCreamBuilder();
		}

		public StyleHomemadeIceCreamBuilder styleHomeMade() {
			return new StyleHomemadeIceCreamBuilder();
		}
	}
}

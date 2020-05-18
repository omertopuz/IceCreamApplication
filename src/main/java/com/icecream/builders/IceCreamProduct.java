package com.icecream.builders;

import java.util.ArrayList;
import java.util.List;

import com.icecream.models.AbstractIceCream;
import com.icecream.models.IceCreamContainer;
import com.icecream.observor.CostCalculator;
import com.icecream.observor.Subject;

/**
 * @author Ömer TOPUZ
 * this is the object that will be observed and calculated of cost
 * and also it is buld up by builder design pattern via com.icecream.builders.IceCreamBuilder
 * */
public class IceCreamProduct implements IceCream,Subject {
	private IceCreamContainer container;

	private List<CostCalculator> observers = new ArrayList<CostCalculator>();
	
	public IceCreamProduct(IceCreamContainer container) {
		this.container = container;
	}

	@Override
	public void presentIceCream() {
//		System.out.println("Enjoy your icecream...");
	}

	public IceCreamContainer getContainer() {
		return container;
	}

	@Override
	public void attach(CostCalculator o) {
		observers.add(o);
		addOrRemoveItem();
	}

	@Override
	public void detach(CostCalculator o) {
		observers.remove(o);
		addOrRemoveItem();
	}
	
	public void addOrRemoveItem() {
		observers.stream().forEach(ob-> ob.updated(this.container));
		for (AbstractIceCream costable : this.container.getIceCreamScoops()) {
			observers.stream().forEach(ob-> ob.updated(costable));
		}
	}
}

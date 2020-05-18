package com.icecream.observor;

import com.icecream.models.Costable;

/**
 * @author Ömer TOPUZ
 * Implementation of Observor design pattern for CostObservor
 * Costable objects are registered and then by using of getPrice method of Costable, total cost will be calculated
 * */
public class CostCalculator implements CostObservor {
	
	private double totalCost;
	
	@Override
	public void updated(Costable item) {
		totalCost += item.getPrice();
	}

	/**
	 *gives the total cost of observed objects
	* */
	public double getTotalCost() {
		return totalCost;
	}
}

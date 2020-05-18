package com.icecream.observor;

import com.icecream.models.Costable;

/**
 * @author Ömer TOPUZ
 * Interface for Observor design pattern
 * Costable objects are registered and then by using of getPrice method of Costable, total cost will be calculated
 * */

public interface CostObservor {
	void updated(Costable order);
}

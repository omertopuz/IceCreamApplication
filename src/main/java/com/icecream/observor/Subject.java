package com.icecream.observor;

public interface Subject {
	public void attach(CostCalculator o);
    public void detach(CostCalculator o);

}

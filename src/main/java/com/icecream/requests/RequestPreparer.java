package com.icecream.requests;

/**
 * @author Ömer TOPUZ
 * Interface for Chain of Responsibility design pattern
 * Aim of this interface is to set the orderState parameter of  com.icecream.requests.RequestOrder
 * when the goal parameter is set to com.icecream.requests.EnumOrderStates.APPROVED,
 * then ordering process will be able to initialized
 * */

public interface RequestPreparer {
	void processPreparation(RequestOrder request);
	
}

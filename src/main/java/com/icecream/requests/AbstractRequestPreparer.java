package com.icecream.requests;

/**
 * @author Ömer TOPUZ
 * An implementation of Chain of Responsibility design pattern
 * the chain is comprised of CheckPayment, CheckStock and CheckCompletion objects
 * */
public abstract class AbstractRequestPreparer implements RequestPreparer {

	private RequestPreparer nextOperation;

	public AbstractRequestPreparer(RequestPreparer nextOperation) {
		super();
		this.nextOperation = nextOperation;
	}

	@Override
	public void processPreparation(RequestOrder order) {
		processRequest(order);
		if (order.getOrderState() == EnumOrderStates.ONGOING_PROCESS && nextOperation != null) {
			nextOperation.processPreparation(order);
		} else		{
			System.out.println("Order State : " + order.getOrderState().name());
		}
	}

	protected abstract void processRequest(RequestOrder order);
}

package com.icecream.requests;

public class CheckPayment extends AbstractRequestPreparer {

	public CheckPayment(RequestPreparer preparer) {
		super(preparer);
	}

	@Override
	protected void processRequest(RequestOrder order) {
		if (checkPayment()) {
			order.setOrderState(EnumOrderStates.ONGOING_PROCESS);
		} else {
			order.setOrderState(EnumOrderStates.REJECTEDBYINSUFFICIENTBALANCE);
		}
	}
	
	private boolean checkPayment() {
		return true;
	}

}

package com.icecream.requests;

public class CheckStock extends AbstractRequestPreparer {

	public CheckStock(RequestPreparer preparer) {
		super(preparer);
	}


	private boolean checkStock() {
		return true;
	}

	@Override
	protected void processRequest(RequestOrder order) {
		if (checkStock()) {
			order.setOrderState(EnumOrderStates.ONGOING_PROCESS);
		} else {
			order.setOrderState(EnumOrderStates.REJECTEDBYSTOCKLEAK);
		}
	}
}

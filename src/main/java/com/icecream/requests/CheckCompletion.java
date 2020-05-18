package com.icecream.requests;

public class CheckCompletion extends AbstractRequestPreparer {
	
	public CheckCompletion(RequestPreparer preparer) {
		super(preparer);
	}

	@Override
	protected void processRequest(RequestOrder order) {
		ultimateChecks();
		order.setOrderState(EnumOrderStates.APPROVED);
	}

	private boolean ultimateChecks() {
		return true;
	}
}

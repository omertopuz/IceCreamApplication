package com.icecream.requests;

import java.util.ArrayList;
import java.util.List;

import com.icecream.models.Costable;

public class RequestOrder {
	private EnumIceCreamStyles iceCreamStyle;
	private EnumContainerTypes container;
	private List<IceCreamScootModel> scoots;

	private List<Costable> observers = new ArrayList<Costable>();

	private EnumOrderStates orderState;

	public RequestOrder(EnumIceCreamStyles iceCreamStyle, EnumContainerTypes container,
			List<IceCreamScootModel> scoots) {
		super();
		this.iceCreamStyle = iceCreamStyle;
		this.container = container;
		this.scoots = scoots;

		orderState = EnumOrderStates.ONGOING_PROCESS;
	}

	public EnumIceCreamStyles getIceCreamStyle() {
		return iceCreamStyle;
	}

	public void setIceCreamStyle(EnumIceCreamStyles iceCreamStyle) {
		this.iceCreamStyle = iceCreamStyle;
	}

	public EnumContainerTypes getContainer() {
		return container;
	}

	public void setContainer(EnumContainerTypes container) {
		this.container = container;
	}

	public List<IceCreamScootModel> getScoots() {
		return scoots;
	}

	public void setScoots(List<IceCreamScootModel> scoots) {
		this.scoots = scoots;
	}

	public EnumOrderStates getOrderState() {
		return orderState;
	}

	public void setOrderState(EnumOrderStates orderState) {
		this.orderState = orderState;
	}

}

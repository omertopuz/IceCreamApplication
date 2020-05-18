package com.icecream;

import java.util.ArrayList;
import java.util.Arrays;

import com.icecream.builders.AbstractIceCreamBuilder;
import com.icecream.builders.AbstractIceCreamBuilder.IceCreamProductBuilder;
import com.icecream.builders.IceCreamBuilder;
import com.icecream.builders.IceCreamProduct;
import com.icecream.decorator.ChocolateSaucedIceCream;
import com.icecream.decorator.HazelnutIceCream;
import com.icecream.factory.icecreamtypes.EnumFruitTypes;
import com.icecream.observor.CostCalculator;
import com.icecream.requests.CheckCompletion;
import com.icecream.requests.CheckPayment;
import com.icecream.requests.CheckStock;
import com.icecream.requests.EnumContainerTypes;
import com.icecream.requests.EnumIceCreamStyles;
import com.icecream.requests.EnumIceCreamTypes;
import com.icecream.requests.EnumOrderStates;
import com.icecream.requests.IceCreamScootModel;
import com.icecream.requests.RequestOrder;

/**
 * @author Ömer TOPUZ
 * A project only for practicing some implementation of design patterns such as
 *  -Builder
 *  -Factory Method
 *  -Singleton
 *  -Decorator
 *  -Chain of Responsibility
 *  -Observor
 *
 *  it is just for fun, not a real project
 * */

public class IceCreamApplicationClient {
	public static void main(String[] args) {
		
		RequestOrder order = new RequestOrder(EnumIceCreamStyles.HOMEMADE,EnumContainerTypes.CORNET,new ArrayList<IceCreamScootModel>(Arrays.asList(
				new IceCreamScootModel(3,EnumIceCreamTypes.VANILLA,null),
				new IceCreamScootModel(2,EnumIceCreamTypes.FRUITFUL,EnumFruitTypes.BANANA)
				)));
		
		IceCreamApplicationClient client = new IceCreamApplicationClient();
		client.prepareOrderWithChainOfResponsibility(order);
		
		if(order.getOrderState() == EnumOrderStates.APPROVED) {
			IceCreamProduct iceCream =client.createIceCreamWithRequestAndBuilder(order);
			System.out.println(order.getOrderState());
			double cost = client.calculateCostsWithObservor(iceCream);
			System.out.println("Total Cost : "+cost);
		}
	}

	/**
	 * @return IceCreamProduct
	 * Sample usage for builder pattern
	 * */
	public IceCreamProduct createIceCreamWithBuilder() {
		IceCreamProduct iceCream = AbstractIceCreamBuilder
				.getIceCreamBuilder()
				.styleGelato()
				.containerCornet()
				.putVanilla(3)
				.putChocolate(1)
				.putFruitful(2,EnumFruitTypes.LEMON)
				.build();
		ChocolateSaucedIceCream decorateWithSauce = new ChocolateSaucedIceCream(iceCream);
		decorateWithSauce.presentIceCream();
		
		HazelnutIceCream decorateWithHazelnut = new HazelnutIceCream(iceCream);
		decorateWithHazelnut.presentIceCream();
		
		iceCream.presentIceCream();
		return iceCream;
	}

	/**
	 * @param order : it defines the style, container and ice cream scoots and also tuple counts
	 * @return IceCreamProduct
	 * Sample usage for builder pattern with order parameter
	 * */
	public IceCreamProduct createIceCreamWithRequestAndBuilder(RequestOrder order) {

		IceCreamProductBuilder productBuilder = AbstractIceCreamBuilder.getIceCreamBuilder();
		IceCreamBuilder builder = order.getIceCreamStyle().setIceCreamStyleType(productBuilder);
		order.getContainer().setContainerTypeObject(builder);
		
		for (IceCreamScootModel s : order.getScoots()) {
			s.getIceCreamType().setIceCreamTypeObject(builder, s.getScootCount(), s.getFruitTypes());
		}
		
		IceCreamProduct iceCream = builder.build();
		order.setOrderState(EnumOrderStates.READY);
		return iceCream;
	}

	/**
	 * @param iceCream
	 * @return double
	 *
	 * */
	public double calculateCostsWithObservor(IceCreamProduct iceCream) {
		CostCalculator calc = new CostCalculator();
		iceCream.attach(calc);
		
		return calc.getTotalCost();
	}

	/**
	 * @param order
	 * checking the order status whether the order is preparable or not.
	 *
	 * */
	public void prepareOrderWithChainOfResponsibility(RequestOrder order) {
		CheckCompletion process3 = new CheckCompletion(null);
		CheckStock process2 = new CheckStock(process3);
		CheckPayment process1 = new CheckPayment(process2);
		process1.processPreparation(order);
	}
}

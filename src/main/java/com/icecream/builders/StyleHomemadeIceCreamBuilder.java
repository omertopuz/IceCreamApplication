package com.icecream.builders;

import com.icecream.models.styles.Homemade;

public class StyleHomemadeIceCreamBuilder extends AbstractIceCreamBuilder {

	@Override
	public void style() {
		iceCreamStyle = new Homemade();
	}	

}

package com.factory.creator;

import com.factory.products.ChicagoStyleCheesePizza;
import com.factory.products.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}else {
			return null;
		}
	}

}

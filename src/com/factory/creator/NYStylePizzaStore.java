package com.factory.creator;

import com.factory.products.NYStyleCheesePizza;
import com.factory.products.Pizza;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else {
			return null;
		}
	}

}

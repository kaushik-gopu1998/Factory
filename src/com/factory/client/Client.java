package com.factory.client;

import com.factory.creator.ChicagoStylePizzaStore;
import com.factory.creator.NYStylePizzaStore;
import com.factory.creator.PizzaStore;
import com.factory.products.Pizza;

public class Client {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		Pizza pizza1=nyPizzaStore.orderPizza("cheese");
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		Pizza pizza2=chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza1.getName());
		System.out.println("Joel ordered a " + pizza2.getName());
	}

}

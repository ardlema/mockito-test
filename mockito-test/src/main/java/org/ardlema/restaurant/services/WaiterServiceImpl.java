package org.ardlema.restaurant.services;

import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.Order;


public class WaiterServiceImpl implements WaiterService {
	
	public ChefService chefService;

	public void setChefService(ChefService chefService) {
		this.chefService = chefService;
	}

	public List<Dish> processOrder(Order order) {
		List<Dish> listOfDishes = chefService.getDishes(order);
		return listOfDishes;
	}

}

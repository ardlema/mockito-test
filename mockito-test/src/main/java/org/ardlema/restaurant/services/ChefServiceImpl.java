package org.ardlema.restaurant.services;

import java.util.ArrayList;
import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.DishAbstractFactory;
import org.ardlema.restaurant.dishes.MenuDish;
import org.ardlema.restaurant.dishes.Order;


public class ChefServiceImpl implements ChefService {

	private List<Dish> dishes = new ArrayList<Dish>();
	
	public List<Dish> getDishes(Order order) {
		for (MenuDish dishCode: order.getDishCodes()){
			Dish dish = DishAbstractFactory.getDish(dishCode);
			dishes.add(dish.cook());
		}
		return dishes;
	}
	
}

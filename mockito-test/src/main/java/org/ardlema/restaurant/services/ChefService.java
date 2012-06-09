package org.ardlema.restaurant.services;

import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.Order;



/**
 * The Chef Service.
 * 
 * @author X172768
 *
 */
public interface ChefService {

	public List<Dish> getDishes(Order order);
	
}

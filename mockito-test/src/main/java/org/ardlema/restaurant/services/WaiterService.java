package org.ardlema.restaurant.services;

import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.Order;


/**
 * The Waiter Service.
 * 
 * @author X172768
 *
 */
public interface WaiterService 
{
    public List<Dish> processOrder(Order order);
}

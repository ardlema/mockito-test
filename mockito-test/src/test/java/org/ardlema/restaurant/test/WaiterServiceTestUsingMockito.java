package org.ardlema.restaurant.test;

import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.DishAbstractFactory;
import org.ardlema.restaurant.dishes.MenuDish;
import org.ardlema.restaurant.dishes.Order;
import org.ardlema.restaurant.services.ChefService;
import org.ardlema.restaurant.services.WaiterService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;




@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/test/java/resources/WaiterServiceTestUsingMockito-ctx.xml"})
public class WaiterServiceTestUsingMockito  {
	
	private static double CHEESE_BURGUER_PRICE = 10.5;
	
	@Autowired
	public WaiterService waiterService;
	
	@Autowired
	public ChefService mockedChef;
	
	@Test
    public void testOrder()  {
		
		when(mockedChef.getDishes((Order)anyObject())).thenReturn(getListOfDishes());
		
		Order tableOrder = new Order();
		
		List<Dish> listOfDishes = waiterService.processOrder(tableOrder);
		
		Dish firstDish = listOfDishes.get(0);
		
		Assert.assertEquals(firstDish.getDishName(),MenuDish.CHEESE_BURGUER);
		Assert.assertEquals(firstDish.getPrice(),CHEESE_BURGUER_PRICE,0);
   }
	
	private List<Dish> getListOfDishes(){
		List<Dish> listOfDishes = new ArrayList<Dish>();
		
		Dish burguer = DishAbstractFactory.getDish(MenuDish.CHEESE_BURGUER);
	
		listOfDishes.add(burguer.cook());
		
		return listOfDishes;
	}

}



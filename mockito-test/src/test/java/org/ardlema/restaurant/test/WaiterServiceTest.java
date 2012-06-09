package org.ardlema.restaurant.test;

import java.util.List;

import org.ardlema.restaurant.dishes.Dish;
import org.ardlema.restaurant.dishes.MenuDish;
import org.ardlema.restaurant.dishes.Order;
import org.ardlema.restaurant.services.WaiterService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/test/java/resources/WaiterServiceTest-ctx.xml"})
public class WaiterServiceTest  {
	
	private static double CHEESE_BURGUER_PRICE = 10.5; 
	private static double PIZZA_PRICE = 8.5; 
	
	private Order testOrder;
	
	
	@Autowired
	public WaiterService waiterService;
	
	@Before 
	public void initialize() {
 		testOrder = new Order();
		testOrder.setTableCode("Table 1");
		MenuDish[] tableDishes = new MenuDish[2];
		tableDishes[0] = MenuDish.CHEESE_BURGUER;
		tableDishes[1] = MenuDish.PIZZA; 
		testOrder.setDishCodes(tableDishes);
	}
	
	@Test
    public void testOrder()  {
		
		List<Dish> listOfDishes = waiterService.processOrder(testOrder);
		
		Dish firstDish = listOfDishes.get(0);
		Dish secondDish = listOfDishes.get(1);
		
		Assert.assertEquals(firstDish.getDishName(),MenuDish.CHEESE_BURGUER);
		Assert.assertEquals(firstDish.getPrice(),CHEESE_BURGUER_PRICE,0);
		
		Assert.assertEquals(secondDish.getDishName(),MenuDish.PIZZA);
		Assert.assertEquals(secondDish.getPrice(),PIZZA_PRICE,0);
		       
    }

}



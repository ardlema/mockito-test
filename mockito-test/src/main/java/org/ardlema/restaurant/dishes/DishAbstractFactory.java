package org.ardlema.restaurant.dishes;

public class DishAbstractFactory {
	
	public static Dish getDish(MenuDish dishCode){
		switch (dishCode){
			case CHEESE_BURGUER: return new CheeseBurguer(); 
					
			case PIZZA: return new Pizza();
			        
			default: //TODO: implement DishCodeNotFoundException
				     return null;
			         
				}
	}
	
}

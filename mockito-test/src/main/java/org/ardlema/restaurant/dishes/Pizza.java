package org.ardlema.restaurant.dishes;

public class Pizza extends Dish {
	
	private static double PIZZA_PRICE = 8.5; 
	private static String PIZZA_INGREDIENT_1 = "Tomato";
	private static String PIZZA_INGREDIENT_2 = "Cheese";
	private static String PIZZA_INGREDIENT_3 = "Bacon";
	private static String PIZZA_INGREDIENT_4 = "Pepperoni";
	

	public final Dish cook(){
		Dish pizza = new Pizza();
		pizza.dishName = MenuDish.PIZZA;
		pizza.price = PIZZA_PRICE;
		String[] pizzaIngredients = {PIZZA_INGREDIENT_1, 
				PIZZA_INGREDIENT_2, 
				PIZZA_INGREDIENT_3, 
	    		PIZZA_INGREDIENT_4 };
		pizza.ingredients = pizzaIngredients;
		return pizza;
	}

}

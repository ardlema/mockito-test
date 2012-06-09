package org.ardlema.restaurant.dishes;

public class CheeseBurguer extends Dish {
	
	private static double CHEESE_BURGUER_PRICE = 10.5; 
	private static String CHEESE_BURGUER_INGREDIENT_1 = "Lettuce";
	private static String CHEESE_BURGUER_INGREDIENT_2 = "Cheese";
	private static String CHEESE_BURGUER_INGREDIENT_3 = "Beef";
	private static String CHEESE_BURGUER_INGREDIENT_4 = "Tomato";
	
	
	public final Dish cook(){
		Dish burguer = new CheeseBurguer();
		burguer.dishName = MenuDish.CHEESE_BURGUER;
		burguer.price = CHEESE_BURGUER_PRICE;
		String[] burguerIngredients = {CHEESE_BURGUER_INGREDIENT_1, 
				CHEESE_BURGUER_INGREDIENT_2, 
				CHEESE_BURGUER_INGREDIENT_3, 
				CHEESE_BURGUER_INGREDIENT_4 };
		burguer.ingredients = burguerIngredients;
		return burguer;
	}

}

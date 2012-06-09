package org.ardlema.restaurant.dishes;

public abstract class Dish {

	protected MenuDish dishName;
	protected double price;
	protected String[] ingredients;
	
	public String[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}

	public MenuDish getDishName() {
		return dishName;
	}

	public void setDishName(MenuDish dishName) {
		this.dishName = dishName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract Dish cook();
	
	
}

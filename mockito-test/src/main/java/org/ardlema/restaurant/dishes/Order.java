package org.ardlema.restaurant.dishes;


public class Order {

	private String tableCode;
	
	private MenuDish[] dishCodes;
	
	public String getTableCode() {
		return tableCode;
	}

	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}

	public MenuDish[] getDishCodes() {
		return dishCodes;
	}

	public void setDishCodes(MenuDish[] dishCodes) {
		this.dishCodes = dishCodes;
	}

	
}

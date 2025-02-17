package oop.videoYT;

import java.util.ArrayList;

public class Shop {
	//can store objects
	private ArrayList<Item> items;
	private ArrayList<FoodMeat> foodMeats;

	public Shop() {
		items = new ArrayList<>();
		foodMeats = new ArrayList<>();
	}

	// adds the item to shop
	public void addItem(Item item) {
		items.add(item);
	}

	public void addFoodMeat(FoodMeat foodMeat) {
		foodMeats.add(foodMeat);
	}

	// polymorphism compil time (not used)
	public void addItem(String type, String name, int price, int quantity) {
		items.add(new FoodFruit(type, name, price, quantity));
	}

	public void displayShop() {
		for (Item item : items) {
			System.out.println(item.displayInfo());
		}
		for (FoodMeat foodMeat : foodMeats) {
			System.out.println(foodMeat.displayInfo());
		}
	}
}
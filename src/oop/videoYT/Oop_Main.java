package oop.videoYT;

public class Oop_Main {
	public static void main(String[] args) {
		System.out.println("done");

		Shop shop = new Shop();

		// set from object variabele
		FoodFruit foodFruit = new FoodFruit("glow", "pinda", 30, 10);
		FoodMeat foodMeat = new FoodMeat("beef",20, 3, "rare");

		//add the  item to the arrylist
		shop.addItem(foodFruit);
		shop.addFoodMeat(foodMeat);

		shop.displayShop();


	}
}

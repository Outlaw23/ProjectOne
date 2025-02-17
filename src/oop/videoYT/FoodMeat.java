package oop.videoYT;

public class FoodMeat implements ItemStuff {
	private String name;
	private int price;
	private int quantity;
	private String cookt;



	public FoodMeat(String name, int price, int quantity, String cookt) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.cookt = cookt;
	}



	public String getCookt() {
		return cookt;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String displayInfo() {
		return "Name: " + name + ", Price: " + price + ", Quantity: " + quantity + ", Cookt: " + cookt;
	}

}


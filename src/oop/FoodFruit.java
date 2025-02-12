package oop;

public class FoodFruit extends Item {
	private String type;

	public FoodFruit(String type, String name, int price, int quantity) {
		super(name, price, quantity);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override
	// more strict
//	public void displayInfo() {
//		System.out.println("Type: " + type + " Item: " + getName() + " Price: " + getPrice()
//				+ " Quantity: " +getQuantity());
//	}

	public String displayInfo() {
		return "Type: " + type + " Item: " + getName() + " Price: " + getPrice()
				+ " Quantity: " + getQuantity();
	}
}


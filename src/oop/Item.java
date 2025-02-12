package oop;

//class = templet or bleuprint
public abstract class Item {

	// attributes
	private String name;
	private int price;
	private int quantity;
	// attributes

	//constructor
	public Item(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//constructor

	//getter methods
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	//getter methods

	public abstract String displayInfo();

}

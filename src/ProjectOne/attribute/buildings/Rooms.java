package ProjectOne.attribute.buildings;

public class Rooms {

	private static int howManyRooms;
	private String type;
	private int size;

	public Rooms(String type, int size) {

		this.type = type;
		this.size = size;

		howManyRooms++;

	}

	public static int getHowManyRooms() {
		return howManyRooms;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSize(int size) {
		this.size = size;
	}
}

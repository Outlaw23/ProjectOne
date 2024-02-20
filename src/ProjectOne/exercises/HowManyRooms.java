package ProjectOne.exercises;

import ProjectOne.attribute.buildings.Rooms;

public class HowManyRooms {
	// rooms of the student house
	Rooms kitchen = new Rooms("kitchen", 40);
	Rooms livingRoom = new Rooms("living room", 130);
	Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
	Rooms bedroomForNaomie = new Rooms("bedroom", 70);
	Rooms bedroomForArjo = new Rooms("bedroom", 70);
	Rooms bedroomForLinda = new Rooms("bedroom", 60);

	public static void main(String[] args) {
		HowManyRooms howManyRooms = new HowManyRooms();

		howManyRooms.howManyRooms();
	}

	public void howManyRooms() {

		// here you can see how many rooms does student house have?
		System.out.println("how many rooms does student house have?");
		System.out.println(Rooms.getHowManyRooms());
	}

}

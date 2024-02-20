package ProjectOne.exercises;

import ProjectOne.attribute.buildings.Rooms;

public class SizeOfStudentHouse {
	// rooms of the student house
	Rooms kitchen = new Rooms("kitchen", 40);
	Rooms livingRoom = new Rooms("living room", 130);
	Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
	Rooms bedroomForNaomie = new Rooms("bedroom", 70);
	Rooms bedroomForArjo = new Rooms("bedroom", 70);
	Rooms bedroomForLinda = new Rooms("bedroom", 60);

	public static void main(String[] args) {
		SizeOfStudentHouse sizeOfStudentHouse = new SizeOfStudentHouse();
		sizeOfStudentHouse.sizeOfStudentHouse();
	}

	public void sizeOfStudentHouse() {

		// here you can see what is the size of the student house
		System.out.println("what is the size of the student house?");
		System.out.println(kitchen.getSize() + livingRoom.getSize() + bedroomForLisaAndDerik.getSize()
				+ bedroomForNaomie.getSize() + bedroomForArjo.getSize() + bedroomForLinda.getSize());
	}

}

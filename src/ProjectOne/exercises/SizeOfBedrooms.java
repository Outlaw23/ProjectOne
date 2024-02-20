package ProjectOne.exercises;

import ProjectOne.attribute.buildings.Rooms;

public class SizeOfBedrooms {
	Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
	Rooms bedroomForNaomie = new Rooms("bedroom", 70);
	Rooms bedroomForArjo = new Rooms("bedroom", 70);
	Rooms bedroomForLinda = new Rooms("bedroom", 60);

	public static void main(String[] args) {
		SizeOfBedrooms sizeOfBedrooms = new SizeOfBedrooms();
		sizeOfBedrooms.sizeOfBedrooms();
	}

	public void sizeOfBedrooms() {

		// here can see what is the size of all the bedrooms is
		System.out.println("what is the size of all the bedrooms?");
		System.out.println(bedroomForLisaAndDerik.getSize() + bedroomForNaomie.getSize()
				+ bedroomForArjo.getSize() + bedroomForLinda.getSize());
	}
}

package ProjectOne.exercises;

import ProjectOne.attribute.buildings.Rooms;

public class BedroomDifference {
	Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
	Rooms bedroomForLinda = new Rooms("bedroom", 60);

	public static void main(String[] args) {
		BedroomDifference bedroomDifference = new BedroomDifference();
		bedroomDifference.bedroomDifference();
	}

	public void bedroomDifference() {

		// here can see what is the difference between Lisa and Derk's bedroom and Linda's bedroom
		System.out.println("what is the difference between Lisa and Derk's bedroom and Linda's bedroom?");
		System.out.println(bedroomForLisaAndDerik.getSize() - bedroomForLinda.getSize());
	}
}

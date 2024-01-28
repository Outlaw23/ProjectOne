package ProjectOne;


import ProjectOne.attribute.buildings.Rooms;
import ProjectOne.attribute.emotion.Couple;
import ProjectOne.attribute.groups.People;

public class ProjectOne {


	public static void main(String[] args) {

		// rooms of the student house
		Rooms kitchen = new Rooms("kitchen", 40);
		Rooms livingRoom = new Rooms("living room", 130);
		Rooms bedroomForLisaAndDerik = new Rooms("bedroom", 90);
		Rooms bedroomForNaomie = new Rooms("bedroom", 70);
		Rooms bedroomForArjo = new Rooms("bedroom", 70);
		Rooms bedroomForLinda = new Rooms("bedroom", 60);


		// the People
		People lisa = new People("Lisa", 21, true, false);
		People derik = new People("Derik", 19, false, true);
		People naomie = new People("Noamie", 23, true, false);
		People arjo = new People("Arjo", 22, false, true);
		People linda = new People("Linda", 20, true, false);

		// in relationship or single
		Couple Lisa = new Couple(true, "Derik");
		Couple Derik = new Couple(true, "Lisa");
		Couple Naomie = new Couple(false, "no one");
		Couple Arjo = new Couple(false, "no one");
		Couple Linda = new Couple(false, "no one");

		// Here you can see who Lisa is in relationship is
		System.out.println("who is Lisa in a relationship with?");
		System.out.println(Lisa.getRelationeWith());
		System.out.println("are Lisa and Derik in a relationship?");

		// here see if it's really true
		if (Lisa.inRelation == Derik.inRelation) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

		// Here you can see whether the difference in life is not too high or too low
		System.out.println("Isn't that too big a difference with age?");

		if (lisa.getAge() > 22) {
			System.out.println("I actually find that strange too");
		} else if (derik.getAge() < 18) {
			System.out.println("he is still under 18 so that is can not");
		} else {
			System.out.println("It's not too bad, it's in the 4 year range");
		}

		// Here you can see who is single (I don't do every combination)
		if (!Arjo.inRelation && !Naomie.inRelation && !Linda.inRelation) {
			System.out.println("who is single: " + arjo.getName() + ", " + naomie.getName() + " and "
					+ linda.getName());
		} else if (!Arjo.inRelation) {
			System.out.println("who is single: " + arjo.getName());
		} else if (!Naomie.inRelation) {
			System.out.println("who is single: " + naomie.getName());
		} else if (!Lisa.inRelation) {
			System.out.println("who is single: " + linda.getName());
		} else {
			System.out.println("no one single");
		}

		// here you can see how many rooms does student house have?
		System.out.println("how many rooms does student house have?");
		System.out.println(Rooms.getHowManyRooms());

		// here you can see what is the size of the student house
		System.out.println("what is the size of the student house?");
		System.out.println(kitchen.getSize() + livingRoom.getSize() + bedroomForLisaAndDerik.getSize()
				+ bedroomForNaomie.getSize() + bedroomForArjo.getSize() + bedroomForLinda.getSize());

		// here can see what is the size of all the bedrooms is
		System.out.println("what is the size of all the bedrooms?");
		System.out.println(bedroomForLisaAndDerik.getSize() + bedroomForNaomie.getSize()
				+ bedroomForArjo.getSize() + bedroomForLinda.getSize());

		// here can see what is the difference between Lisa and Derk's bedroom and Linda's bedroom
		System.out.println("what is the difference between Lisa and Derk's bedroom and Linda's bedroom?");
		System.out.println(bedroomForLisaAndDerik.getSize() - bedroomForLinda.getSize());

	}
}
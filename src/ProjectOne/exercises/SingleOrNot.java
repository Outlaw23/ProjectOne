package ProjectOne.exercises;

import ProjectOne.attribute.emotion.Couple;
import ProjectOne.attribute.groups.People;

public class SingleOrNot {
	People naomie = new People("Noamie", 23, true, false);
	People arjo = new People("Arjo", 22, false, true);
	People linda = new People("Linda", 20, true, false);

	Couple Naomie = new Couple(false, "no one", 0);
	Couple Arjo = new Couple(false, "no one", 0);
	Couple Linda = new Couple(false, "no one", 0);

	public static void main(String[] args) {
		SingleOrNot singleOrNot = new SingleOrNot();

		singleOrNot.singleOrNot();
	}

	public void singleOrNot() {

		// Here you can see who is single (Not every combination)
		if (!Arjo.inRelation && !Naomie.inRelation && !Linda.inRelation) {
			System.out.println("who is single: " + arjo.getName() + ", " + naomie.getName() + " and "
					+ linda.getName());
		} else if (!Arjo.inRelation) {
			System.out.println("who is single: " + arjo.getName());
		} else if (!Naomie.inRelation) {
			System.out.println("who is single: " + naomie.getName());
		} else if (!Linda.inRelation) {
			System.out.println("who is single: " + linda.getName());
		} else {
			System.out.println("no one single");
		}
	}
}

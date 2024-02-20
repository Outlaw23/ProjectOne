package ProjectOne.exercises;

import ProjectOne.attribute.emotion.Couple;

public class LisaAndDerikInRelation {
	Couple Lisa = new Couple(true, "Derik", 4);
	Couple Derik = new Couple(true, "Lisa", 4);

	public static void main(String[] args) {
		LisaAndDerikInRelation lisaAndDerikInRelation = new LisaAndDerikInRelation();
		
		lisaAndDerikInRelation.lisaAndDerikInRelation();
	}

	public void lisaAndDerikInRelation() {

		// here see if it's really true
		System.out.println("are Lisa and Derik in a relationship?");
		if (Lisa.inRelation == Derik.inRelation) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}
	}
}





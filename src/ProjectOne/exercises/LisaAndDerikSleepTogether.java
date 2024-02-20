package ProjectOne.exercises;

import ProjectOne.attribute.emotion.Couple;

public class LisaAndDerikSleepTogether {
	Couple Lisa = new Couple(true, "Derik", 4);
	Couple Derik = new Couple(true, "Lisa", 4);

	public static void main(String[] args) {
		LisaAndDerikSleepTogether lisaAndDerikSleepTogether = new LisaAndDerikSleepTogether();
		lisaAndDerikSleepTogether.lisaAndDerikSleepTogether();
	}

	public void lisaAndDerikSleepTogether() {

		// here
		System.out.println("why do Lisa and Derik have a large room");
		if (Lisa.inRelation && Derik.inRelation && Lisa.getTogether() > 3 && Derik.getTogether() > 2) {
			System.out.println("because they sleep together");
		} else {
			System.out.println("because they are together");
			System.out.println("but for how long");
		}
	}
}

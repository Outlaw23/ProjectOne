package ProjectOne.exercises;

import ProjectOne.attribute.emotion.Couple;

public class LisaRelationship {
	Couple Lisa = new Couple(true, "Derik", 4);

	public static void main(String[] args) {
		LisaRelationship lisaRelationship = new LisaRelationship();

		lisaRelationship.lisaRelationship();
	}

	public void lisaRelationship() {

		// Here you can see who Lisa is in relationship is
		System.out.println("who is Lisa in a relationship with?");
		System.out.println(Lisa.getRelationeWith());
	}
}

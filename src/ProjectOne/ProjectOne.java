package ProjectOne;


public class ProjectOne {


	public static void main(String[] args) {

		// the People
		People lisa = new People("Lisa", 21, true, false);
		People derik = new People("Derik", 19, false, true);
		People naomie = new People("Noamie", 23, true, false);
		People arjo = new People("Arjo", 22, false, true);

		Couple Lisa = new Couple(true, "Derik");
		Couple Derik = new Couple(true, "Lisa");
		Couple Naomie = new Couple(false, "no one");
		Couple Arjo = new Couple(false, "no one");

		// Here you can see who Lisa is in relationship is
		System.out.println("who is Lisa in a relationship with?");
		System.out.println(Lisa.relationeWith);
		System.out.println("are Lisa and Derik in a relationship?");

		// here see if it's really true
		if (Lisa.inRelation == Derik.inRelation) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

		// Here you can see whether the difference in life is not too high or too low
		System.out.println("Isn't that too big a difference with age?");

		if (lisa.age > 22) {
			System.out.println("I actually find that strange too");
		} else if (derik.age < 18) {
			System.out.println("he is still under 18 so that is can not");
		} else {
			System.out.println("It's not too bad, it's in the 4 year range");
		}

		// Here you can see who is single
		if (!Naomie.inRelation && !Arjo.inRelation) {
			System.out.println("who is single: " + naomie.name + " and " + arjo.name);
		} else if (!Naomie.inRelation) {
			System.out.println("who is single: " + naomie.name);
		} else if (!Arjo.inRelation) {
			System.out.println("who is single: " + arjo.name);
		} else {
			System.out.println("no one single");
		}
	}
}
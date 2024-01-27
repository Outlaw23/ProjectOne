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
		System.out.println("met wie is Lisa in een Relatie?");
		System.out.println(Lisa.relationeWith);
		System.out.println("zijn Lisa en Derik in Relatie? ");

		// here see if it's really true
		if (Lisa.inRelation == Derik.inRelation) {
			System.out.println("ja");
		} else {
			System.out.println("nee");
		}

		// Here you can see whether the difference in life is not too high or too low
		System.out.println("dat is tog te groot verschil met leeftijd?");

		if (lisa.age > 22) {
			System.out.println("inderdaad vind dat ook raar");
		} else if (derik.age < 18) {
			System.out.println("hij is nog jonger dan 18 dus kan niet");
		} else {
			System.out.println("het valt best mee het zit in de 4 jaar range");
		}

		// Here you can see who is single
		if (!Naomie.inRelation && !Arjo.inRelation) {
			System.out.println("wie zijn er single: " + naomie.name + ", " + arjo.name);
		} else if (!Naomie.inRelation) {
			System.out.println("wie zijn er single: " + naomie.name);
		} else if (!Arjo.inRelation) {
			System.out.println("wie zijn er single: " + arjo.name);
		} else {
			System.out.println("niemand is single");
		}
	}
}
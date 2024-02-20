package ProjectOne.exercises;

import ProjectOne.attribute.groups.People;

public class AgeDifference {
	People lisa = new People("Lisa", 21, true, false);
	People derik = new People("Derik", 19, false, true);

	public static void main(String[] args) {
		AgeDifference ageDifference = new AgeDifference();

		ageDifference.ageDifference();
	}

	public void ageDifference() {

		// Here you can see whether the difference in life is not too high or too low
		System.out.println("Isn't that too big a difference with age?");

		if (lisa.getAge() > 22) {
			System.out.println("I actually find that strange too");
		} else if (derik.getAge() < 18) {
			System.out.println("he is still under 18 so that is can not");
		} else {
			System.out.println("It's not too bad, it's in the 4 year range");
		}
	}

}

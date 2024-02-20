package ProjectOne.exercises;

import java.util.Scanner;

public class Excursion {
	String message = "";

	public static void main(String[] args) {
		Excursion excursion = new Excursion();
		excursion.excursion();
	}

	public void excursion() {

		Scanner scanner = new Scanner(System.in);

		while (!message.equals("exit")) {

			System.out.println("pick your number 0, 1, 2");
			System.out.println("exit is stop");

			message = scanner.nextLine();

			if ("0".equals(message)) {

				System.out.println("you win: 10 dollars");
			} else if ("1".equals(message)) {

				System.out.println("you win: speed boat");
			} else if ("2".equals(message)) {

				System.out.println("you win: toilet roll");
			}

		}

	}
}

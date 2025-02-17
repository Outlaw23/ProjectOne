package oop.pokebattle;

public class pokebattle {
	public static void main(String[] args) {
		boolean quit = true;
		while (quit) {
			charmender charmender1 = new charmender("","fire","water");
			charmender1.names();
			for (int i = 0; i < 10; i++) {
				System.out.println(charmender1.getNickname());
			}
			charmender1.names();
			for (int i = 0; i < 10; i++) {
				System.out.println(charmender1.getNickname());
			}
			if (charmender1.Quit().equals("n")) {
				System.out.println("go again");
			} else {
				quit = false;
			}

		}

	}
}


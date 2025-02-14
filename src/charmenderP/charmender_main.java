package charmenderP;

public class charmender_main {
	public static void main(String[] args) {
		while (true) {
			charmender charmender1 = new charmender("","fire","water");
			charmender1.names();
			for (int i = 0; i < 10; i++) {
				System.out.println(charmender1.getNickname());
			}
			charmender1.names();
			for (int i = 0; i < 10; i++) {
				System.out.println(charmender1.getNickname());
			}
			break;
		}

	}
}

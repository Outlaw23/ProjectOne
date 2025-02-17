package oop.pokebattle;

import java.util.Scanner;

public class charmender {
	private String nickname;
	private String Strength;
	private String weakness;


	public charmender(String nickname, String Strength, String weakness) {
		this.nickname = nickname;
		this.Strength = Strength;
		this.weakness = weakness;
	}


	public String getNickname() {
		return nickname;
	}

	public String getStrength() {
		return Strength;
	}

	public String getWeakness() {
		return weakness;
	}

	public String display() {
		return nickname + " " + Strength + " " + weakness;
	}
	public String names() {

		Scanner nickName = new Scanner(System.in);
		System.out.print("Nickname: ");
		nickname = nickName.nextLine();
		return nickname;
	}
	public String Quit() {

		Scanner nickName = new Scanner(System.in);
		System.out.print("do you want to quit? (y/n): ");
		nickname = nickName.nextLine();
		return nickname;
	}

}

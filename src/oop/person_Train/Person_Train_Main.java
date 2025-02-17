package oop.person_Train;

public class Person_Train_Main {
	public static void main(String[] args) {
		Person person = new Person("kees", "pinda", 66);
		train train = new train(8,30);

		person.bemanTrain(train);

		System.out.println(train.conductur.getName());
	}
}

package ProjectOne;

public class People {
	String name;
	int age;

	public People(String name, int age, Boolean female, Boolean male) {

		this.name = name;
		this.age = age;
	}

	public People() {
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
}



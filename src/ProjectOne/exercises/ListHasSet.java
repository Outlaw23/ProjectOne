package ProjectOne.exercises;

import java.util.*;

public class ListHasSet {
	public static void main(String[] args) {
		ListHasSet here = new ListHasSet();
		here.her();
	}

	public void her() {

		List<Integer> number = new ArrayList<>();

		number.add(3);
		number.add(40);
		number.add(63);
		number.add(94);

		Collections.shuffle(number);

		System.out.println(number.get(0));

		List<Integer> numbe = new ArrayList<>();

		numbe.add(3);
		numbe.add(40);
		numbe.add(63);
		numbe.add(94);
		for (int numbers : numbe)
			System.out.println(numbers);




		/* List<Integer> numbers = Arrays.asList(); // This only works in Minecraft (you can then remove the numbers.add).
		numbers.add(3);
		numbers.add(40);
		numbers.add(63);
		numbers.add(94);

		Collections.shuffle(numbers);

		System.out.println(numbers); */

		Set<Integer> numberss = new HashSet<>();

		numberss.add(3);
		numberss.add(40);
		numberss.add(63);
		numberss.add(94);


		System.out.println(numberss);

	}
}

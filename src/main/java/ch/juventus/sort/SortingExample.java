package ch.juventus.sort;

import ch.juventus.object.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.sort;
import static java.util.stream.Collectors.toList;

public class SortingExample {

	public static void main(String[] args){
		List<Person> personList = Arrays.asList(
				new Person("Hans", "Muster", null, false),
				new Person("Peter", "Keller", null, false),
				new Person("Lisa", "Muster", null, false),
				new Person("Anna", "Keller", null, false)
		);


		System.out.println(personList);
		sort(personList, Comparator.comparing((Person o) -> (o.firstName + o.name)));
		System.out.println(personList);

		List<String> stringList = Arrays.asList(
				"Bravo", "Alpha", "Delta", "Charlie"
		);

		System.out.println(stringList);
		stringList.sort(Comparator.comparing((String str) -> str.length()).reversed());
		System.out.println(stringList);

		List<String> myNewStringList = stringList.stream()
				.map(o -> o + '!')
				.map(String::toUpperCase)
				.filter(o -> o.contains("E"))
				.collect(toList());
		System.out.println(myNewStringList);

	}
}

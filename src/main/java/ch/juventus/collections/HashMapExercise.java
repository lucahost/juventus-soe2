package ch.juventus.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExercise {

    public static void main(String[] args) {
        Map<String, List<Person>> map = new HashMap<>();
        List<Person> family = Arrays.asList(
                new Person("Bob"),
                new Person("Berta"),
                new Person("Berti")
        );
        map.put("family", family);
        map.put("office", null);
        map.put("friends", Arrays.asList(
                new Person("John"),
                new Person("Joe"),
                new Person("Jim")
        ));
        System.out.println(map);
        map.put("office", Arrays.asList(
                new Person("Herr Schmidt"),
                new Person("Herr Meyer")
        ));
        map.put(null, Arrays.asList(
                new Person("Herr Schmidt"),
                new Person("Herr Meyer")
        ));
        System.out.println(map.get("office"));
        System.out.println(map.get("pets"));
        System.out.println(map.size());
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());
    }

    private static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}

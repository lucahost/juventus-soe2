package ch.juventus.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercise {
    public static void main(String[] args) {
        Map<Integer, Person> map = new TreeMap<>();
        map.put(3, new Person("Cyrill"));
        map.put(26, new Person("Zeffie"));
        map.put(1, new Person("Anton"));
        map.put(19, new Person("Steffi"));
        map.put(2, new Person("Berta"));
        map.put(3, new Person("Claus"));
        System.out.println(map);
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

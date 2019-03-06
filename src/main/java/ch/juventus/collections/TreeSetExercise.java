package ch.juventus.collections;

import java.util.*;

public class TreeSetExercise {

    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("Bob", "Bobsen"));
        set.forEach(item -> System.out.println(item));

    }

    private static class Person implements Comparable<Person> {
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {
            return firstName;
        }


        @Override
        public String toString() {
            return "Person{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Person o) {
            return getLastName().compareTo(o.getLastName());
        }
    }
}

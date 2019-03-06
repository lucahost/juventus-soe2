package ch.juventus.collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetExercise {

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();

        persons.add(new Person("Bob", "Bobs"));
        persons.add(new Person("Bob", "Bobs"));
        persons.add(new Person("Rob", "Robs"));

        System.out.println(persons.size());
        persons.forEach(person -> System.out.println(person.hashCode()));
        System.out.println(persons);
    }

    private static class Person {
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
        }

        @Override
        public int hashCode() {

            return Objects.hash(firstName, lastName);
        }

        @Override
        public String toString() {
            return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
        }
    }
}

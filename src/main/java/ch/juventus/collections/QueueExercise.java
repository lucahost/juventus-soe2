package ch.juventus.collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Heinz",  "Kabutz"));
        queue.add(new Person("Stefan",  "Tilkov"));
        queue.add(new Person("Josh",  "Bloch"));
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }

    private static class Person {
        String firstName;
        String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
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

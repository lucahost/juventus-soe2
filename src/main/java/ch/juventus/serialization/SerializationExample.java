package ch.juventus.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class SerializationExample {

    public static void main(String[] args) {
        Path persons = Paths.get("Persons.ser");
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(persons))) {
            List<Person> personList = Arrays.asList(
                new Person("Matt"),
                new Person("Jimmy"));
            out.writeObject(personList);
        } catch (IOException e) {
          e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(Files.newInputStream(persons))) {
            List<Person> personList = (List<Person>) in.readObject();
            personList.forEach(person -> System.out.println(person.getName()));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

private static class Person implements Serializable {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static class Address implements Serializable {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
    }
}
}

package ch.juventus.object;

import java.util.Objects;

public class Person {

    private String firstName;
    private String name;
    private Address address;
    boolean hasKids;

    public Person(String firstName, String name, Address address, boolean hasKids) {
        this.firstName = firstName;
        this.name = name;
        this.address = address;
        this.hasKids = hasKids;
    }

    @Override
    public String toString() {
        return "Person{" +
            "firstName='" + firstName + '\'' +
            ", name='" + name + '\'' +
            ", address=" + address +
            ", hasKids=" + hasKids +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
            Objects.equals(name, person.name) &&
            Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, name, address);
    }
}

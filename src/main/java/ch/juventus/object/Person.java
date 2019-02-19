package ch.juventus.object;

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
}

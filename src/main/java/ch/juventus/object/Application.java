package ch.juventus.object;

public class Application {

    public static void main(String[] args) {
        Person person = new Person("Bob", "Bob",
            new Address("There", "10b", "12321", "New Alstetten"), false );

        System.out.printf("Person: %s\n", person);
    }

}

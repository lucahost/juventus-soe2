package ch.juventus.exceptions;


public class Application {

    public static void main(String[] args) {
        PersonRepository pr = new PersonRepository();
        try {
            pr.findById(42);
        } catch (NotFoundException e) {
            e.getMessage();
        }
        pr.addPerson(null);
    }
}

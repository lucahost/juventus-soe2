package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {


    public Person findById(int id) throws NotFoundException {
        throw new NotFoundException();
    }

    public void addPerson(Person p) throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}

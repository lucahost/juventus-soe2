package ch.juventus.sockets;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonStore {

    private Set<Person> persons = new HashSet<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }

    public Set<Person> getPersonsByLastName(String lastName) {
        return persons
            .stream()
            .filter(p -> lastName.equals(p.getLastName()))
            .collect(Collectors.toSet());
    }

}

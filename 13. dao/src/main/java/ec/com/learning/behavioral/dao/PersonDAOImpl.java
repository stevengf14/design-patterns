package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class PersonDAOImpl implements PersonDAO {

    @Override
    public List<Person> allPeople() {
        List<Person> list = new ArrayList<>();
        Person person = new Person();
        person.setId(1);
        person.setNames("Steven");
        list.add(person);

        Person person2 = new Person();
        person.setId(2);
        person.setNames("Nicole");
        list.add(person2);

        return list;
    }

    @Override
    public Person getById() {
        // logic
        return null;
    }

    @Override
    public void add(Person person) {
        System.out.println("Person: " + person.getNames() + " registered");
    }

    @Override
    public void update(Person person) {
        System.out.println("Person: " + person.getNames() + " updated");
    }

    @Override
    public void delete(int id) {
        System.out.println("id: " + id + " deleted");
    }

}

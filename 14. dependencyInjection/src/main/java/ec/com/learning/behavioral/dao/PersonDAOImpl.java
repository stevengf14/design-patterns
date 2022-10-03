package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class PersonDAOImpl implements PersonDAO {

    private IConnection connection;

    /*public PersonDAOImpl(IConnection connection) {
        this.connection = connection;
    }*/

    public void setConnection(IConnection connection) {
        this.connection = connection;
    }

    @Override
    public List<Person> listAll() {
        this.connection.connect();
        System.out.println("all people...");
        return null;
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

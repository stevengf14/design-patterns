package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven - September 2022
 */
public class PersonDAOImpl implements PersonDAO {

    private Connection connection;
    private String motor;

    public PersonDAOImpl(String motor) {
        this.motor = motor;

        if (motor.equals("MYSQL")) {
            connection = new MySQL();
        } else if (motor.equals("POSTGRESQL")) {
            connection = new PostgreSQL();
        }
        connection.connect();
    }

    @Override
    public List<Person> listAll() {
        List<Person> list = new ArrayList<>();

        if (motor.equals("MYSQL")) {
            Person person = new Person();
            person.setId(1);
            person.setNames("Mito MYSQL");
            person.setAge(30);
            list.add(person);

            person = new Person();
            person.setId(2);
            person.setNames("Steven MYSQL");
            person.setAge(25);
            list.add(person);

        } else if (motor.equals("POSTGRESQL")) {
            Person person = new Person();
            person.setId(1);
            person.setNames("Code POSTGRESQL");
            person.setAge(27);
            list.add(person);

            person = new Person();
            person.setId(2);
            person.setNames("Steven POSTGRESQL");
            person.setAge(27);
            list.add(person);

        }
        return list;
    }

}

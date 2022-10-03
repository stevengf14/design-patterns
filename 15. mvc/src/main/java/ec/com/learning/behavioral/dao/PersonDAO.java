package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Person;
import java.util.List;

/**
 *
 * @author Steven - September 2022
 */
public interface PersonDAO extends CRUD<Person> {

    public List<Person> listAll();

}

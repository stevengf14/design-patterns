package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Person;

/**
 *
 * @author Steven Guamán - October 2022
 */
public interface PersonDAO extends CRUD<Person> {

    void setConnection(IConnection connection);
    
}

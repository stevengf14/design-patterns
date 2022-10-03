package ec.com.learning.behavioral.service;

import java.util.List;

import ec.com.learning.behavioral.dao.PersonDAO;
import ec.com.learning.behavioral.model.Person;

/**
 *
 * @author Steven - September 2022
 */
public class PersonServiceImpl implements PersonService {

    private PersonDAO dao;

    public PersonServiceImpl(PersonDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Person> listAll() {
        return dao.listAll();
    }

}

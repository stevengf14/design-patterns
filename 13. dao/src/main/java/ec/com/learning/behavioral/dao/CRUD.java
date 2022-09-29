package ec.com.learning.behavioral.dao;

import ec.com.learning.behavioral.model.Doctor;
import java.util.List;

/**
 *
 * @author Steven Guamán - September 2022
 */
public interface CRUD<T> {

    List<T> allPeople();

    T getById();

    void add(T t);

    void update(T t);

    void delete(int id);

}

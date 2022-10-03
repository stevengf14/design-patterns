package ec.com.learning.behavioral.dao;

import java.util.List;

/**
 *
 * @author Steven Guamán - October 2022
 */
public interface CRUD<T> {

    List<T> listAll();

    T getById();

    void add(T t);

    void update(T t);

    void delete(int id);

}

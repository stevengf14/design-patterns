package ec.com.learning.behavioral.dao;

import java.util.List;

/**
 *
 * @author Steven - September 2022
 */
public interface CRUD<T> {

	List<T> listAll();
}

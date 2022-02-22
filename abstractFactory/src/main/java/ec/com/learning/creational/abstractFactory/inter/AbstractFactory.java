package ec.com.learning.creational.abstractFactory.inter;

/**
 *
 * @author Steven Guamán - February 2022
 */
public interface AbstractFactory {
    
    DBConnection getDB(String database);
    
    RESTConnection getREST(String area);
    
}

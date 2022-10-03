package ec.com.learning.behavioral.dao;

/**
 *
 * @author Steven - September 2022
 */
public class PostgreSQL implements Connection {

    @Override
    public void connect() {
        System.out.println("Connecting to POSTGRESQL");
    }

}

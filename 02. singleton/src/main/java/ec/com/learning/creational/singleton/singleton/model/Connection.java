package ec.com.learning.creational.singleton.singleton.model;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class Connection {

    private static Connection instance;

    /**
     * private -> to avoid creating new Connection instances (using new
     * Connection)
     */
    private Connection() {

    }

    /**
     * Validate if the instace exists if it doesn't exist, it creates a new
     * instance else, return the instance
     *
     * @return instance
     */
    public static Connection getInstance() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    /**
     * Test method
     */
    public void connect() {
        System.out.println("System connected");
    }

    /**
     * Test method
     */
    public void disconnect() {
        System.out.println("System disconnected");
    }
}

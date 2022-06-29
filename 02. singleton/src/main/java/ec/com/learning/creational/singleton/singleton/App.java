package ec.com.learning.creational.singleton.singleton;

import ec.com.learning.creational.singleton.singleton.model.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class App {

    public static void main(String[] args) {
        // Connection c2 = new Connection();
        Connection c1 = Connection.getInstance();
        c1.connect();
        c1.disconnect();

        boolean ans = c1 instanceof Connection;
        System.out.println(ans);
    }
}

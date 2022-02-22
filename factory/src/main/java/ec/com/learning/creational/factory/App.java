package ec.com.learning.creational.factory;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class App {

    public static void main(String[] args) {
        FactoryConnection factory = new FactoryConnection();
        Connection c1 = factory.getConnection("MYSQL");
        c1.connect();
        c1.disconnect();
        
        Connection c2 = factory.getConnection("ORACLE");
        c2.connect();
        c2.disconnect();
        
        Connection c3 = factory.getConnection("POSTGRESQL");
        c3.connect();
        c3.disconnect();
        
        Connection c4 = factory.getConnection("SQLSERVER");
        c4.connect();
        c4.disconnect();
        
        Connection c5 = factory.getConnection("XXXXX");
        c5.connect();
        c5.disconnect();
    }
    
}

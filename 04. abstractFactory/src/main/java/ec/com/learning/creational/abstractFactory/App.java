package ec.com.learning.creational.abstractFactory;

import ec.com.learning.creational.abstractFactory.inter.AbstractFactory;
import ec.com.learning.creational.abstractFactory.inter.DBConnection;
import ec.com.learning.creational.abstractFactory.inter.RESTConnection;
import java.io.ByteArrayInputStream;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class App {

    public static void main(String[] args) {
        AbstractFactory dbFactory = ProductorFactory.getFactory("DB");
        DBConnection cDB1 = dbFactory.getDB("ORACLE");
        cDB1.connect();
        cDB1.disconnect();
        
        AbstractFactory restFactory = ProductorFactory.getFactory("REST");
        RESTConnection cR1 = restFactory.getREST("SALES");
        cR1.readURL("https://www.youtube.com");
        cR1.readInputStream(new ByteArrayInputStream("sale 1: something, sale 2: something, sale 3: something".getBytes()), "sale");
                
    }
    
}

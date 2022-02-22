package ec.com.learning.creational.abstractFactory;

import ec.com.learning.creational.abstractFactory.inter.AbstractFactory;
import ec.com.learning.creational.abstractFactory.inter.DBConnection;
import ec.com.learning.creational.abstractFactory.inter.RESTConnection;
import ec.com.learning.creational.abstractFactory.inter.impl.RESTConnectionNoArea;
import ec.com.learning.creational.abstractFactory.inter.impl.RESTConnectionPurchases;
import ec.com.learning.creational.abstractFactory.inter.impl.RESTConnectionSales;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class RESTConnectionFactory implements AbstractFactory {

    @Override
    public DBConnection getDB(String database) {
        return null;
    }

    @Override
    public RESTConnection getREST(String area) {
        if (area == null) {
            return new RESTConnectionNoArea();
        }
        if (area.equalsIgnoreCase("PURCHASES")) {
            return new RESTConnectionPurchases();
        } else if (area.equalsIgnoreCase("SALES")) {
            return new RESTConnectionSales();
        }
        return new RESTConnectionNoArea();
    }

}

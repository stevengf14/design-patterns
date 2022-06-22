package ec.com.learning.creational.abstractFactory;

import ec.com.learning.creational.abstractFactory.inter.AbstractFactory;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class ProductorFactory {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType.equalsIgnoreCase("DB")) {
            return new DBConnectionFactory();
        } else if (factoryType.equalsIgnoreCase("REST")) {
            return new RESTConnectionFactory();
        }
        return null;
    }
}

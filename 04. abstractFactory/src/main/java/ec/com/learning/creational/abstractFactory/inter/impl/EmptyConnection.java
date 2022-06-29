package ec.com.learning.creational.abstractFactory.inter.impl;

import ec.com.learning.creational.abstractFactory.inter.DBConnection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class EmptyConnection implements DBConnection {

    @Override
    public void connect() {
        System.out.println("Unspecified DataBase provider");
    }

    @Override
    public void disconnect() {
        System.out.println("Unspecified DataBase provider");
    }
    
}

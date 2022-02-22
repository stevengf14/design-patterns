package ec.com.learning.creational.factory.inter.impl;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class EmptyConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("Unspecified DataBase provider");
    }

    @Override
    public void disconnect() {
        System.out.println("Unspecified DataBase provider");
    }
    
}

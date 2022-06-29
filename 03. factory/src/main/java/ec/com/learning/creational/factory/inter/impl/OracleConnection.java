package ec.com.learning.creational.factory.inter.impl;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class OracleConnection implements Connection {

    private String host;
    private String port;
    private String user;
    private String password;

    public OracleConnection() {
        this.host = "localhost";
        this.port = "1521";
        this.user = "root";
        this.password = "root";
    }

    @Override
    public void connect() {
        System.out.println("Connected to Oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from Oracle");
    }

    @Override
    public String toString() {
        return "Oracle Connection [host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + "]";
    }

}

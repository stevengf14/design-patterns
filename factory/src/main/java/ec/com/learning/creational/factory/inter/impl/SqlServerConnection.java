package ec.com.learning.creational.factory.inter.impl;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class SqlServerConnection implements Connection {

    private String host;
    private String port;
    private String user;
    private String password;

    public SqlServerConnection() {
        this.host = "localhost";
        this.port = "1433";
        this.user = "root";
        this.password = "root";
    }

    @Override
    public void connect() {
        System.out.println("Connected to SQLServer");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from SQLServer");
    }

    @Override
    public String toString() {
        return "SQLServer Connection [host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + "]";
    }

}

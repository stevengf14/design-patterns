package ec.com.learning.creational.factory.inter.impl;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class PostgresqlConnection implements Connection {

    private String host;
    private String port;
    private String user;
    private String password;

    public PostgresqlConnection() {
        this.host = "localhost";
        this.port = "5433";
        this.user = "root";
        this.password = "root";
    }

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from PostgreSQL");
    }

    @Override
    public String toString() {
        return "PostgreSQL Connection [host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + "]";
    }

}

package ec.com.learning.creational.factory.inter.impl;

import ec.com.learning.creational.factory.inter.Connection;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class MysqlConnection implements Connection {

    private String host;
    private String port;
    private String user;
    private String password;

    public MysqlConnection() {
        this.host = "localhost";
        this.port = "3306";
        this.user = "root";
        this.password = "root";
    }

    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL");
    }

    @Override
    public String toString() {
        return "MySQL Connection [host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + "]";
    }

}

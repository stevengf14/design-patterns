package ec.com.learning.behavioral.dao;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class ConnectionMYSQL implements IConnection {

    private String user;
    private String password;
    private String host;

    public ConnectionMYSQL(String user, String password, String host) {
        this.user = user;
        this.password = password;
        this.host = host;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to MYSQL");
    }

}

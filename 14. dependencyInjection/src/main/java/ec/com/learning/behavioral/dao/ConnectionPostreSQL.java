package ec.com.learning.behavioral.dao;

/**
 *
 * @author Steven Guamán - October 2022
 */
public class ConnectionPostreSQL implements IConnection {

    private String user;
    private String password;
    private String host;

    public ConnectionPostreSQL(String user, String password, String host) {
        this.user = user;
        this.password = password;
        this.host = host;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to PostreSQL");
    }

}

package ec.com.learning.structural.proxy.model;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Account {

    private int id;
    private String client;
    private double initBalance;

    public Account(int id, String client, double initBalance) {
        this.id = id;
        this.client = client;
        this.initBalance = initBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public double getInitBalance() {
        return initBalance;
    }

    public void setInitBalance(double initBalance) {
        this.initBalance = initBalance;
    }

}

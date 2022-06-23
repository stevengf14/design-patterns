package ec.com.learning.structural.command.commands;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
        System.out.println("[WITHDRAW COMMAND] Account: " + id + " Balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("[DEPOSIT COMMAND] Account: " + id + " Balance: " + this.balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

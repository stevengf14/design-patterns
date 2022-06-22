package ec.com.learning.creational.prototype.model;

import ec.com.learning.creational.prototype.inter.Account;

/**
 *
 * @author Steven Guam�n - February 2022
 */
public class SavingsAccountImpl implements Account {

    private String type;
    private double amount;

    public SavingsAccountImpl() {
        type = "SAVINGS";
    }

    @Override
    public Account createClone() {
        SavingsAccountImpl account = null;
        try {
            account = (SavingsAccountImpl) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public String toString() {
        return "SavingsAccount[type=" + type + ", amount=" + amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}

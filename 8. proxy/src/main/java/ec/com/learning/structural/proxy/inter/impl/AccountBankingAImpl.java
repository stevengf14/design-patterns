package ec.com.learning.structural.proxy.inter.impl;

import ec.com.learning.structural.proxy.inter.IAccount;
import ec.com.learning.structural.proxy.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class AccountBankingAImpl implements IAccount {

    @Override
    public Account withdraw(Account account, double amount) {
        double actualBalance = account.getInitBalance() - amount;
        account.setInitBalance(actualBalance);
        System.out.println("Actual Balance: " + account.getInitBalance());
        return account;
    }

    @Override
    public Account deposit(Account account, double amount) {
        double actualBalance = account.getInitBalance() + amount;
        account.setInitBalance(actualBalance);
        System.out.println("Actual Balance: " + account.getInitBalance());
        return account;
    }

    @Override
    public void showBalance(Account account) {
        System.out.println("Actual Balance: " + account.getInitBalance());
    }

}

package ec.com.learning.structural.proxy.inter;

import ec.com.learning.structural.proxy.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public interface IAccount {

    Account withdraw(Account account, double amount);

    Account deposit(Account account, double amount);

    void showBalance(Account account);
}

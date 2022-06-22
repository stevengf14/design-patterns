package ec.com.learning.structural.decorator.inter.impl;

import ec.com.learning.structural.decorator.inter.IAccountBanking;
import ec.com.learning.structural.decorator.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class SavingsAccount implements IAccountBanking {

    @Override
    public void openAccount(Account c) {
        System.out.println("------------------------------");
        System.out.println("Savings account opened");
        System.out.println("Client: " + c.getClient());
    }

}

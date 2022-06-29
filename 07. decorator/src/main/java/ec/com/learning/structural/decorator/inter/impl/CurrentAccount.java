package ec.com.learning.structural.decorator.inter.impl;

import ec.com.learning.structural.decorator.inter.IAccountBanking;
import ec.com.learning.structural.decorator.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class CurrentAccount implements IAccountBanking {

    @Override
    public void openAccount(Account c) {
        System.out.println("------------------------------");
        System.out.println("Current account opened");
        System.out.println("Client: " + c.getClient());
    }

}

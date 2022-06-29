package ec.com.learning.structural.decorator.decorator;

import ec.com.learning.structural.decorator.inter.IAccountBanking;
import ec.com.learning.structural.decorator.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class DecoratorShield extends DecoratorAccount {

    public DecoratorShield(IAccountBanking decoratedAccount) {
        super(decoratedAccount);
    }

    @Override
    public void openAccount(Account c) {
        decoratedAccount.openAccount(c);
        addShield(c);
    }

    public void addShield(Account c) {
        System.out.println("Shield added to the client " + c.getClient());
    }
}

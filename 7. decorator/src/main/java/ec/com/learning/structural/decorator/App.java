package ec.com.learning.structural.decorator;

import ec.com.learning.structural.decorator.decorator.DecoratorShield;
import ec.com.learning.structural.decorator.inter.IAccountBanking;
import ec.com.learning.structural.decorator.inter.impl.SavingsAccount;
import ec.com.learning.structural.decorator.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class App {

    public static void main(String[] args) {
        Account c = new Account(1, "Design Patterns Account");

        IAccountBanking account = new SavingsAccount();
        IAccountBanking accountShield = new DecoratorShield(account);

        // account.openAccount(c);
        accountShield.openAccount(c);
    }
}

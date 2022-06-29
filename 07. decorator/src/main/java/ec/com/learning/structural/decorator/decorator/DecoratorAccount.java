package ec.com.learning.structural.decorator.decorator;

import ec.com.learning.structural.decorator.inter.IAccountBanking;
import ec.com.learning.structural.decorator.model.Account;

/**
 *
 * @author Steven Guamán - June 2022
 */
public abstract class DecoratorAccount implements IAccountBanking {
    
    protected IAccountBanking decoratedAccount;
    
    public DecoratorAccount(IAccountBanking decoratedAccount){
        this.decoratedAccount = decoratedAccount;
    }
    
    @Override
    public void openAccount(Account c) {
        this.decoratedAccount.openAccount(c);
    }

}

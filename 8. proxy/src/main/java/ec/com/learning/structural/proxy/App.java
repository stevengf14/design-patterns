package ec.com.learning.structural.proxy;

import ec.com.learning.structural.proxy.inter.IAccount;
import ec.com.learning.structural.proxy.inter.impl.AccountBankingAImpl;
import ec.com.learning.structural.proxy.inter.impl.AccountBankingBImpl;
import ec.com.learning.structural.proxy.model.Account;
import ec.com.learning.structural.proxy.rpoxy.ProxyAccount;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class App {
    
    public static void main(String[] args) {
        Account c = new Account(1, "test", 100);
        
        IAccount proxyAccount = new ProxyAccount(new AccountBankingBImpl());
        proxyAccount.showBalance(c);
        c = proxyAccount.deposit(c, 50);
        c = proxyAccount.withdraw(c, 20);
        proxyAccount.showBalance(c);
    }
}

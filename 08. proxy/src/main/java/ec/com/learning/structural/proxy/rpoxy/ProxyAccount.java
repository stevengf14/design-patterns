package ec.com.learning.structural.proxy.rpoxy;

import ec.com.learning.structural.proxy.inter.IAccount;
import ec.com.learning.structural.proxy.inter.impl.AccountBankingAImpl;
import ec.com.learning.structural.proxy.model.Account;
import java.util.logging.Logger;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class ProxyAccount implements IAccount {

    private IAccount realAccount;
    private final static Logger LOGGER = Logger.getLogger(ProxyAccount.class.getName());

    public ProxyAccount(IAccount realAccount) {
        this.realAccount = realAccount;
    }

    @Override
    public Account withdraw(Account account, double amount) {
        LOGGER.info("---- Proxy Account - Withdraw ----");
        if (realAccount == null) {
            realAccount = new AccountBankingAImpl();
            return realAccount.withdraw(account, amount);
        } else {
            return realAccount.withdraw(account, amount);
        }
    }

    @Override
    public Account deposit(Account account, double amount) {
        LOGGER.info("---- Proxy Account - Deposit ----");
        if (realAccount == null) {
            realAccount = new AccountBankingAImpl();
            return realAccount.deposit(account, amount);
        } else {
            return realAccount.deposit(account, amount);
        }
    }

    @Override
    public void showBalance(Account account) {
        LOGGER.info("---- Proxy Account - Show Balance ----");
        if (realAccount == null) {
            realAccount = new AccountBankingAImpl();
            realAccount.showBalance(account);
        } else {
            realAccount.showBalance(account);
        }
    }
}

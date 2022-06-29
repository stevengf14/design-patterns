package ec.com.learning.behavioral.command;

import ec.com.learning.behavioral.command.commands.Account;
import ec.com.learning.behavioral.command.commands.DepositImpl;
import ec.com.learning.behavioral.command.commands.Invoker;
import ec.com.learning.behavioral.command.commands.WithdrawImpl;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class App {
    
    public static void main(String[] args) {
        Account account = new Account(1, 200);
        
        DepositImpl depositOperation = new DepositImpl(account, 100);
        WithdrawImpl withdrawOperation = new WithdrawImpl(account, 50);
        DepositImpl depositOperation2 = new DepositImpl(account, 300);
        
        Invoker invoker = new Invoker();
        invoker.receiveOperations(depositOperation);
        invoker.receiveOperations(depositOperation2);
        invoker.receiveOperations(withdrawOperation);
        
        invoker.executeOperations();
    }
}

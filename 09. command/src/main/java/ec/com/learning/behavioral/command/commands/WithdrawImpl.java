package ec.com.learning.behavioral.command.commands;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class WithdrawImpl implements IOperation {
    
    private Account account;
    private double amount;
    
    public WithdrawImpl(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        this.account.withdraw(this.amount);
    }
}

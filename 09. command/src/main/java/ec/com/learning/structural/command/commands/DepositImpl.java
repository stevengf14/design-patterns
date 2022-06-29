package ec.com.learning.structural.command.commands;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class DepositImpl implements IOperation {
    
    private Account account;
    private double amount;
    
    public DepositImpl(Account account, double amount) {
        this.account = account;
        this.amount = amount;
    }
    
    @Override
    public void execute() {
        this.account.deposit(this.amount);
    }
}

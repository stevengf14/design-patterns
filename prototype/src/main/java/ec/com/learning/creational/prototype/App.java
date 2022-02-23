package ec.com.learning.creational.prototype;

import ec.com.learning.creational.prototype.model.SavingsAccountImpl;

/**
 *
 * @author Steven Guamán - February 2022
 */
public class App {

    public static void main(String[] args) {
        
        SavingsAccountImpl savingsAccount = new SavingsAccountImpl();
        savingsAccount.setAmount(200);
        
        SavingsAccountImpl savingsAccount2 = new SavingsAccountImpl();
        
        SavingsAccountImpl clonedAccount = (SavingsAccountImpl) savingsAccount.createClone();
        
        System.out.println(savingsAccount);
        System.out.println(savingsAccount2);
        System.out.println(clonedAccount);
    }
    
}

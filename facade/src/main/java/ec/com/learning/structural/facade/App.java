package ec.com.learning.structural.facade;

import ec.com.learning.structural.facade.facade.CheckFacade;

/**
 *
 * @author Steven Guamán - March 2022
 */
public class App {

    public static void main(String[] args) {
        CheckFacade client1 = new CheckFacade();
        client1.find("01/04/2022", "01/05/2022", "Quito", "Madrid");
        
        CheckFacade client2 = new CheckFacade();
        client1.find("16/05/2022", "31/05/2022", "Quito", "Alicante");
    }
    
}

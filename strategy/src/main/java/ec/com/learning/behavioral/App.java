package ec.com.learning.behavioral;

import ec.com.learning.behavioral.strategy.AdvancedAntivirus;
import ec.com.learning.behavioral.strategy.Context;
import ec.com.learning.behavioral.strategy.SimpleAntivirus;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class App {

    public static void main(String[] args) {
        Context simpleContext = new Context(new SimpleAntivirus());
        simpleContext.execute();
        Context advancedContext = new Context(new AdvancedAntivirus());
        advancedContext.execute();
        
    }

}

package ec.com.learning.behavioral.strategy;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute() {
        this.strategy.analyze();
    }

}

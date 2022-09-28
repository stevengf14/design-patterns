package ec.com.learning.behavioral.strategy;

/**
 *
 * @author Steven Guamán - September 2022
 */
public abstract class SimpleAnalyze implements IStrategy {

    public void analyze() {
        init();
        skipZip();
        stop();
    }

    abstract void init();

    abstract void skipZip();

    abstract void stop();

}

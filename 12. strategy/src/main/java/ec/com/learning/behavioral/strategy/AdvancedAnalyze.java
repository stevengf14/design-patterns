package ec.com.learning.behavioral.strategy;

/**
 *
 * @author Steven Guamán - September 2022
 */
public abstract class AdvancedAnalyze implements IStrategy {

    public void analyze() {
        init();
        analyzeMemory();
        analyzeKeyloggers();
        analyzeRootKits();
        descompressZip();
        stop();
    }

    abstract void init();

    abstract void analyzeMemory();

    abstract void analyzeKeyloggers();

    abstract void analyzeRootKits();

    abstract void descompressZip();

    abstract void stop();
    
}

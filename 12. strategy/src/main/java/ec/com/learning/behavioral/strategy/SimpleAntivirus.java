package ec.com.learning.behavioral.strategy;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class SimpleAntivirus extends SimpleAnalyze {

    @Override
    void init() {
        System.out.println("Simple Antivirus - Simple analysis started");
    }

    @Override
    void skipZip() {
        try {
            System.out.println("Anlyzing...");
            Thread.sleep(2500);
            System.out.println("We can't analyze .zip files");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Simple Antivirus - Simple analysis finished");
    }

}

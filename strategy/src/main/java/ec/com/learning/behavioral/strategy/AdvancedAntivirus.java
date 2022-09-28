package ec.com.learning.behavioral.strategy;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class AdvancedAntivirus extends AdvancedAnalyze {

    @Override
    void init() {
        System.out.println("Advanced Antivirus - Advanced analysis started");
    }

    @Override
    void analyzeMemory() {
        try {
            System.out.println("Anlyzing RAM...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analyzeKeyloggers() {
        try {
            System.out.println("Anlyzing Keyloggers...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void analyzeRootKits() {
        try {
            System.out.println("Anlyzing Roor Kits...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void descompressZip() {
        try {
            System.out.println("Anlyzing Zip files...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    void stop() {
        System.out.println("Advanced Antivirus - Advanced analysis finished");
    }

}

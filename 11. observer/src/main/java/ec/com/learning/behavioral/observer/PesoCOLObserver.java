package ec.com.learning.behavioral.observer;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class PesoCOLObserver extends Observer {

    private double currencyExchange = 4554.01;

    public PesoCOLObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("COL: " + (subject.getState() * currencyExchange));
    }
    
}

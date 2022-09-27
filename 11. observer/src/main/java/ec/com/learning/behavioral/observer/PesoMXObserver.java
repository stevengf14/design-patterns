package ec.com.learning.behavioral.observer;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class PesoMXObserver extends Observer {

    private double currencyExchange = 20.37;

    public PesoMXObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("MX: " + (subject.getState() * currencyExchange));
    }

}

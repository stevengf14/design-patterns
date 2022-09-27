package ec.com.learning.behavioral.observer;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class PesoARGObserver extends Observer {

    private double currencyExchange = 146.56;

    public PesoARGObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("ARG: " + (subject.getState() * currencyExchange));
    }
    
}

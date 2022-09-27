package ec.com.learning.behavioral;

import ec.com.learning.behavioral.observer.PesoARGObserver;
import ec.com.learning.behavioral.observer.PesoCOLObserver;
import ec.com.learning.behavioral.observer.PesoMXObserver;
import ec.com.learning.behavioral.observer.Subject;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new PesoARGObserver(subject);
        new PesoCOLObserver(subject);
        new PesoMXObserver(subject);

        System.out.println("If want to exchange 1 dollar, you will have: ");
        subject.setState(1);
        System.out.println("-----------------------------------------------");
        System.out.println("If want to exchange 10 dollars, you will have: ");
        subject.setState(10);
        System.out.println("-----------------------------------------------");
        System.out.println("If want to exchange 100 dollars, you will have: ");
        subject.setState(100);

    }

}

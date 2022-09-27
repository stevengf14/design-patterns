package ec.com.learning.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven Guamán - September 2022
 */
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }
}

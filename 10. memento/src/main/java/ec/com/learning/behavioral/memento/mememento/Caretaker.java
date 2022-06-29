package ec.com.learning.behavioral.memento.mememento;

import java.util.ArrayList;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Caretaker {

    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

}

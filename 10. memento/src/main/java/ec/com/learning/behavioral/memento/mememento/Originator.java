package ec.com.learning.behavioral.memento.mememento;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Originator {

    private VideoGame state;

    public VideoGame getState() {
        return state;
    }

    public void setState(VideoGame state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }

}

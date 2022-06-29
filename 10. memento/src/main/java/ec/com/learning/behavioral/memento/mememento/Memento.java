package ec.com.learning.behavioral.memento.mememento;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class Memento {

    private VideoGame state;

    public Memento(VideoGame state) {
        this.state = state;
    }

    public VideoGame getState() {
        return state;
    }

}

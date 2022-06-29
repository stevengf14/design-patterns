package ec.com.learning.behavioral.memento;

import ec.com.learning.behavioral.memento.mememento.Caretaker;
import ec.com.learning.behavioral.memento.mememento.Originator;
import ec.com.learning.behavioral.memento.mememento.VideoGame;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class App {

    public static void main(String[] args) {
        String videoGameName = "Crash Bandicoot";

        VideoGame videoGame = new VideoGame();
        videoGame.setName(videoGameName);
        videoGame.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        videoGame = new VideoGame();
        videoGame.setName(videoGameName);
        videoGame.setCheckpoint(2);
        originator.setState(videoGame);

        videoGame = new VideoGame();
        videoGame.setName(videoGameName);
        videoGame.setCheckpoint(3);
        originator.setState(videoGame);

        caretaker.addMemento(originator.save()); // STATE POSITION 0

        videoGame = new VideoGame();
        videoGame.setName(videoGameName);
        videoGame.setCheckpoint(4);

        originator.setState(videoGame);
        caretaker.addMemento(originator.save()); // STATE POSITION 1

        videoGame = new VideoGame();
        videoGame.setName(videoGameName);
        videoGame.setCheckpoint(5);

        originator.setState(videoGame);
        caretaker.addMemento(originator.save()); // STATE POSITION 2

        originator.setState(videoGame);
        originator.restore(caretaker.getMemento(1));

        videoGame = originator.getState();
        System.out.println(videoGame);
    }

}

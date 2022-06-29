package ec.com.learning.behavioral.memento.mememento;

/**
 *
 * @author Steven Guamán - June 2022
 */
public class VideoGame {

    private String name;
    private int checkpoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public String toString() {
        return "VideoGame{" + "name=" + name + ", checkpoint=" + checkpoint + '}';
    }

}

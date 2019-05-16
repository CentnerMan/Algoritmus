package lesson7.homework;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 12.05.2019
 * @link https://github.com/Centnerman
 */

public class Vertex {
    public char label;

    public boolean wasVisited;

    public Vertex(char label) {
        this.label = label;
        this.wasVisited = false;
    }
}

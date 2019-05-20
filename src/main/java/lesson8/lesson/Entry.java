package lesson8.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 19.05.2019
 * @link https://github.com/Centnerman
 */

public class Entry {
    private Item key;
    private int value;
    private Entry nextEntry;

    public Entry getNextEntry() {
        return nextEntry;
    }

    public void setNextEntry(Entry nextEntry) {
        this.nextEntry = nextEntry;
    }

    public Entry(Item key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public Item getKey() {
        return key;
    }

    public void setKey(Item key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

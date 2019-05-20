package lesson8.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 18.05.2019
 * @link https://github.com/Centnerman
 */

public class HashTableLinksImpl implements HashTable {

    private SortedListEntry[] data;
    private int size;
    private int maxSize;

    public HashTableLinksImpl(int maxSize) {
        data = new SortedListEntry[maxSize];
        this.maxSize = maxSize;
        for (int i = 0; i < data.length; i++) {
            data[i] = new SortedListEntry();
        }
    }

    private int hashFunc(int key) {
        return key % data.length;
    }

    @Override
    public boolean put(Item item, Integer cost) {
        int hashVal = hashFunc(item.getId()); //hashing
        data[hashVal].insert(new Entry(item, cost)); // insert to hashVal position
        size++;
        return true;
    }

    @Override
    public Integer get(Item item) {
        int hashVal = hashFunc(item.getId());
        Entry theEntry = data[hashVal].find(item);
        if (theEntry != null) {
            return theEntry.getValue();
        } else return null;
    }

    @Override
    public boolean remove(Item item) {
        int hashVal = hashFunc(item.getId());
        Entry theEntry = data[hashVal].find(item);
        if (theEntry != null) {
            data[hashVal].delete(item);
            size--;
            return true;
        }
        return false;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            data[i].showList();
        }
        System.out.println("----------");
    }
}

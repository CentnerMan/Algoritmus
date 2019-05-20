package lesson8.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 18.05.2019
 * @link https://github.com/Centnerman
 */

public class HomeWork {

    public static void main(String[] args) {

        HashTable hashTable = new HashTableLinksImpl(5);

        hashTable.put(new Item(1, "Orange"), 150);
        hashTable.put(new Item(77, "Banana"), 100);
        hashTable.put(new Item(62, "Lemon"), 250);
        hashTable.put(new Item(21, "Potato"), 67);
        hashTable.put(new Item(55, "Milk"), 120);

        System.out.println("Size is " + hashTable.getSize());
        hashTable.display();

        System.out.println("Cost potato is " + hashTable.get(new Item(21, "Potato")));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));

        hashTable.remove(new Item(77, "Banana"));
        System.out.println("Cost banana is " + hashTable.get(new Item(77, "Banana")));
        hashTable.display();
    }
}

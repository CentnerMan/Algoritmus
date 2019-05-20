package lesson8.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 19.05.2019
 * @link https://github.com/Centnerman
 */

public class SortedListEntry {
    private Entry first; //First element link

    //--------------------------------------------------------

    public SortedListEntry() { //constructor
        first = null;
    }

    //---------------------------------------------------------

    public void insert(Entry theEntry) { //sorted insert
        int key = theEntry.getKey().getId();
        Entry previous = null; //from first element
        Entry current = first;
        //while end of list or currrent <= key
        while (current != null && key > current.getKey().getId()) {
            previous = current;
            current = current.getNextEntry(); //select next item
        }
        if (previous == null) //first item of list
            first = theEntry; // first -> new item
        else
            previous.setNextEntry(theEntry); // previous -> new element
        theEntry.setNextEntry(current);      // new item -> current
    }

    //---------------------------------------------------------

    public void delete(Item item) { //list not empty
        Entry previous = null; //from first element
        Entry current = first;

//        while (current != null && item != current.getKey()) {
        while (current != null && item.getId() != current.getKey().getId()) {
            previous = current;
            current = current.getNextEntry(); //select next item
        }
        if (previous == null) //if first item
            first = first.getNextEntry(); // next item -> first
        else
            previous.setNextEntry(current.getNextEntry()); // previous -> new element
    }

    //---------------------------------------------------------

    public Entry find(Item item) {
        Entry current = first;

        while (current != null && item.getId() >= current.getKey().getId()) {
            if (current.getKey().getId() == item.getId()) {
                return current;
            } else {
                current = current.getNextEntry();
            }
        }
        return null; //item not found
    }

    //---------------------------------------------------------

    public void showList() {
        System.out.print("List (first-->last): ");
        Entry current = first;
        while (current != null) {
            System.out.print(current + " - ");
            current = current.getNextEntry();
        }
        System.out.println("");
    }

}

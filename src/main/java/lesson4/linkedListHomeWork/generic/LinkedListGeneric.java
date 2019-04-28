package lesson4.linkedListHomeWork.generic;

public class LinkedListGeneric {
    private LinkGeneric first;

    public LinkedListGeneric() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(String name, int age) {
        LinkGeneric newLink = new LinkGeneric(name, age);
        newLink.next = first;
        first = newLink;
    }

    public LinkGeneric delete() {
        LinkGeneric temp = first;
        first = first.next;
        return temp;
    }

    public void display() {
        LinkGeneric current = first;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }

}

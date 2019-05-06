package lesson4.linkedListHomeWork.queue;

import lesson4.linkedListHomeWork.twoside.Link;
import lesson4.linkedListHomeWork.twoside.LinkedList;

public class Queue {
    private LinkedList queue;

    public Queue() {
        queue = new LinkedList();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void insert(String name, int age) {
        queue.insertFirst(name, age);
    }

    public Link delete() {
        return queue.delete();
    }

    public void display() {
        queue.display();
    }

}

package lesson4.linkedListHomeWork.stack;

import lesson4.linkedListHomeWork.twoside.LinkedList;

public class StackList {
    private LinkedList list;

    public StackList() {
        list = new LinkedList();
    }

    public void push(String name, int age) {
        list.insertFirst(name, age);
    }

    public String pop() {
        return list.delete().name;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }

}

package lesson4.linkedListHomeWork.generic;

public class GenericListApp {
    public static void main(String[] args) {
        LinkedListGeneric list = new LinkedListGeneric();
        list.insert("Vasily", 15);
        list.insert("Bob", 18);
        list.insert("Garry", 25);

        list.display();
    }
}

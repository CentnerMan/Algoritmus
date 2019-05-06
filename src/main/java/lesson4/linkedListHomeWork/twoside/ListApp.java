package lesson4.linkedListHomeWork.twoside;

public class ListApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst("Artem", 30);
        list.insertFirst("Misha", 10);
        list.insertFirst("Vova", 5);
        list.insertLast("Petya", 25);

        list.display();
        System.out.println("Удаление элементов списка");

        list.delete("Vova");
        list.display();
    }
}

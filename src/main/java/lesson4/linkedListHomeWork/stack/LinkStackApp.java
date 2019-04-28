package lesson4.linkedListHomeWork.stack;

public class LinkStackApp {
    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push("Artem", 30);
        sl.push("Viktor", 20);
        sl.push("Sergey", 10);
        sl.display();
        while (!sl.isEmpty()) {
            System.out.println("Элемент " + sl.pop() + " удален из стека");
        }
    }
}

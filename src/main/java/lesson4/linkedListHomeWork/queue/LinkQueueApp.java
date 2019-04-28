package lesson4.linkedListHomeWork.queue;

public class LinkQueueApp {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert("Artem", 30);
        q.insert("Viktor", 20);
        q.insert("Sergey", 10);
        q.display();
        while (!q.isEmpty()) {
            System.out.println("Элемент " + q.delete() + " удален из стека");
        }
    }
}

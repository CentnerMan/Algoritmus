package lesson4.linkedListHomeWork.iterator;

public class LinkIteratorApp {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);
        itr.insertBefore("Ivan", 18);
        itr.insertBefore("Michael", 30);
        itr.insertBefore("Silver", 45);

        list.display();
        System.out.println("-------------------------------------------");
        itr.reset();
        itr.nextLink();
        itr.deleteCurrent();
        System.out.println(itr.getCurrent().name);
        itr.nextLink();
        itr.insertAfter("Bill", 60);
        list.display();
    }

}

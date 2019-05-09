package lesson6.lesson;

public class Main6 {

    public static void main(String[] args) {
        Tree<Integer> tree = new TreeImpl<>();
//        tree.add(60);
//        tree.add(25);
//        tree.add(66);
//        tree.add(15);
//        tree.add(5);
//        tree.add(20);
//        tree.add(45);
//        tree.add(30);
//        tree.add(32);
//        tree.add(55);
//        tree.add(55);

        for (int i = 0; i < 100; i++) {
            Integer num = (int) (Math.random() * 300 - 150);
            if (!tree.find(num)) tree.add(num);
        }

        tree.traverse(Tree.TraverseMode.POST_ORDER);

        tree.display();

//        System.out.println("Find 60: " + tree.find(60));
//        System.out.println("Find 45: " + tree.find(45));
//        System.out.println("Find 32: " + tree.find(32));
//        System.out.println("Find 666: " + tree.find(666));

//        tree.remove(66);
//        tree.remove(30);
//        tree.remove(25);
//        tree.display();
    }
}

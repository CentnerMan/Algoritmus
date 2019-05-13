package lesson6.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 09.05.2019
 * @link https://github.com/Centnerman
 */

public class CheckBalancedTrees {
    private static final int NUM_TREES = 20;
    private static final int DEPTH_LEVEL = 6;
    private static final int MAX_NUM = 20;

    public static void main(String[] args) {
        int balancedTrees = 0; // Количество сбалансированных деревьев

        for (int i = 0; i < NUM_TREES; i++) {
            TreeImpl<Integer> tree = new TreeImpl<>();
//            tree.add(0); // root по центру
            tree.setCurrentDepth(1);
            for (int j = 0; j < 100; j++) {
                Integer num = (int) (Math.random() * MAX_NUM * 2 - MAX_NUM);
//                System.out.println(num + " " + j);
                if (tree.getCurrentDepth() < DEPTH_LEVEL) {
//                    System.out.println(num + " ----- " + j);
                    if (!tree.find(num)) tree.add(num);
                }
            }
            tree.display();
            if (tree.isBalanced(tree.getRoot())) {
//                System.out.println("Сбалансировано");
                balancedTrees++;
            }
//            else System.out.println("Не сбалансировано");
        }

        System.out.println("Сбалансировано " + (balancedTrees * 100 / NUM_TREES) + "% деревьев");
        System.out.println("Не сбалансировано " + (100 - (balancedTrees * 100 / NUM_TREES)) + "% деревьев");
    }
}

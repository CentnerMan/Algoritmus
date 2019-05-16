package lesson7.lesson;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 14.05.2019
 * @link https://github.com/Centnerman
 */

public class HomeWork {
    public static void main(String[] args) {
        MoscowVoronezh();
    }

    private static void MoscowVoronezh() {

        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Воронеж");
        graph.addVertex("Тула");
        graph.addVertex("Рязань");
        graph.addVertex("Калуга");
        graph.addVertex("Липецк");
        graph.addVertex("Тамбов");
        graph.addVertex("Орел");
        graph.addVertex("Саратов");
        graph.addVertex("Курск");

        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdges("Тула", "Москва", "Липецк");
        graph.addEdges("Рязань", "Москва", "Тамбов");
        graph.addEdges("Калуга", "Москва", "Орел");
        graph.addEdges("Липецк", "Тула", "Воронеж");
        graph.addEdges("Тамбов", "Рязань", "Саратов");
        graph.addEdges("Орел", "Калуга", "Курск");
        graph.addEdges("Саратов", "Тамбов", "Воронеж");
        graph.addEdges("Курск", "Орел", "Воронеж");
        graph.addEdges("Воронеж", "Липецк", "Саратов", "Курск");

        graph.display();
        System.out.println("Длина кратчайшего пути: " + graph.bfsToFinish("Москва", "Воронеж"));
//        System.out.println("Длина кратчайшего пути: " + graph.bfsToFinish("Москва", "Тамбов"));
//        System.out.println("Длина кратчайшего пути: " + graph.bfsToFinish("Москва", "Калуга"));
//        System.out.println("Длина кратчайшего пути: " + graph.bfsToFinish("Москва", "Москва"));
    }
}

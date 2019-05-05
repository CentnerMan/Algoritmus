package lesson5.homework.bagpack;

import java.util.ArrayList;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 01.05.2019
 * @link https://github.com/Centnerman
 */

//2.	Написать программу «Задача о рюкзаке» с помощью рекурсии.

public class BagPackCoast {

    private static final int MAX_WEIGHT = 13; //  максимальный вес предметов в рюкзаке
    private static int poolItems; // количество исходных предметов

    private static Bag bag = new Bag(MAX_WEIGHT);
    private static Bag bestBag = bag;

    public static void main(String[] args) {

        // Определяем запас предметов для наполнения рюкзака
        ArrayList<Item> itemsL = new ArrayList<>();
        itemsL.add(new Item("Хлеб", 2, 100));
        itemsL.add(new Item("Ноутбук", 6, 30000));
        itemsL.add(new Item("Кастрюля", 4, 500));
        itemsL.add(new Item("Мясо", 4, 2000));
        itemsL.add(new Item("Картофель", 8, 100));
        itemsL.add(new Item("Куртка", 2, 8000));

        poolItems = itemsL.size();

        // конвертируем в массив для удобства работы

        Item[] items = new Item[poolItems];
        for (int i = 0; i < poolItems; i++) {
            items[i] = itemsL.get(i);
        }

        sortBubble(items); // сортируем массив по уменьшению стоимости


        pullBag(0, bag, items); // index - начальное значение для перебора

        bestBag.display();
    }

    private static void sortBubble(Item[] items) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - 1 - i; j++) {
                if (items[j].getCoast() < items[j + 1].getCoast()) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

    private static void pullBag(int index, Bag bag, Item[] items) {

        if (index >= poolItems) return; // Вне диапазона

        for (int k = 0; k < poolItems; k++) {
            for (int i = index; i < poolItems; i++) { // идем по всем предметам

                if (bag.getMaxWeight() >= bag.getCurrentWeight() + items[i].getWeight()) { // Влезает?
                    bag.add(items[i]); // Запихиваем
                    if (bag.getCoastItems() > bestBag.getCoastItems())
                        bestBag = bag; // Если оптимальнее - в лучший рюкзак;
                }
                pullBag(i + 1, bag, items);
                rotate(items, i);
            }
            rotate(items, k);
        }
    }

    private static void rotate(Item[] items, int pos) {
        int i;
        Item temp = items[pos];
        for (i = pos; i < poolItems - 1; i++) {
            items[i] = items[i + 1];
        }
        items[poolItems - 1] = temp;
    }
}

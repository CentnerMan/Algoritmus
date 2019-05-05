package lesson5.homework.bagpack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 03.05.2019
 * @link https://github.com/Centnerman
 */

public class BagBackWeight {
    private static final int MAX_WEIGHT = 13; //  максимальный вес предметов в рюкзаке
    private static int poolItems; // количество исходных предметов

    private static Bag bag = new Bag(MAX_WEIGHT);
    private static Bag bestBag = bag;

    public static void main(String[] args) {

        // Определяем запас предметов для наполнения рюкзака
        ArrayList<Item> itemsL = new ArrayList<>();
        itemsL.add(new Item("Хлеб", 2, 100));
        itemsL.add(new Item("Ноутбук", 6, 30000));
        itemsL.add(new Item("Картофель", 8, 100));
        itemsL.add(new Item("Мясо", 4, 2000));
        itemsL.add(new Item("Куртка", 2, 8000));
        itemsL.add(new Item("Кастрюля", 4, 500));

        poolItems = itemsL.size();

        // конвертируем в массив для удобства работы

        Item[] items = new Item[poolItems];
        for (int i = 0; i < poolItems; i++) {
            items[i] = itemsL.get(i);
        }

        pullBag(0, bag, items); // i - начальное значение для перебора

        bestBag.display();
    }

    private static void pullBag(int i, Bag bag, Item[] items) {

        if (i >= poolItems) return; // Вне диапазона


        for (int j = i; j < poolItems; j++) { // идем по всем предметам

            if (bag.getMaxWeight() >= bag.getCurrentWeight() + items[j].getWeight()) { // Влезает?
                bag.add(items[j]); // Запихиваем
                if (bag.getCurrentWeight() == MAX_WEIGHT) { // Максимальный вес достигнут - поиск прекращаем
                    bestBag = bag;
                    return;
                } else if (bag.getCurrentWeight() > bestBag.getCurrentWeight())
                    bestBag = bag; // Если оптимальнее - в лучший рюкзак;
            }
            pullBag(j + 1, bag, items);
            rotate(items, poolItems - 1);
        }
    }

    private static void rotate(Item[] items, int newSize) {
        int i;
        int position = items.length - newSize;
        Item temp = items[position];
        for (i = position + 1; i < items.length; i++) {
            items[i - 1] = items[i];
        }
        items[i - 1] = temp;
    }
}

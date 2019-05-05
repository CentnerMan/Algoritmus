package lesson5.homework.bagpack;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 01.05.2019
 * @link https://github.com/Centnerman
 */

public class Bag {
    private int maxWeight; // Максимальный вес предметов в рюкзаке
    private int numItems = 0; // количество предметов в рюкзаке. При создании рюкзака он пуст.
    private int coastItems = 0; // стоимость предметов в рюкзаке. При создании рюкзака 0.
    private int currentWeight = 0; // Текущий вес предметов
    Item[] items = new Item[100]; // Максимально вмещает 100 предметов

    ///////////////////////////////////////////////////////////////////////////////


    public Bag(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    ///////////////////////////////////////////////////////////////////////////////
    public int getNumItems() {
        return numItems;
    }

    public int getCoastItems() {
        return coastItems;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public Item[] getItems() {
        return items;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    ///////////////////////////////////////////////////////////////////////////////

    public void display() {
        System.out.println("В рюкзаке с максимальным весом: " + maxWeight + " находятся предметы с общим весом: " + currentWeight);
        for (int i = 0; i < numItems; i++) {
            System.out.println(items[i].getName() + ", весом: " + items[i].getWeight() + ", стоимостью: " + items[i].getCoast());
        }
        System.out.println("Общая стоимость предметов: " + coastItems);
    }

    ///////////////////////////////////////////////////////////////////////////////

    public void add(Item item) { // Кладем предмет в рюкзак
        items[numItems++] = item;
        currentWeight = currentWeight + item.getWeight(); // Увеличиваем текущий вес на вес предмета
        coastItems = coastItems + item.getCoast();  // Увеличиваеваем стоимость предметов в рюкзаке на стоимость предмета
    }

    ///////////////////////////////////////////////////////////////////////////////

    public void remove(int i) { // Убираем предмет из рюкзака
        currentWeight = currentWeight - items[i].getWeight(); // Уменьшаем текущий вес на вес предмета
        coastItems = coastItems - items[i].getCoast();  // Уменьшаем стоимость предметов в рюкзаке на стоимость предмета
        items[i] = null;
        numItems--;
    }
}

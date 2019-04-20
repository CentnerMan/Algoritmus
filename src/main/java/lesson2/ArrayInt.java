package lesson2;

/**
 * Java, algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 16.04.2019
 * @link https://github.com/Centnerman
 */

class ArrayInt {
    int[] arr;
    int size;

    public ArrayInt(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    // Поиск ------------------------------------------------------------------------------------------------------

    public boolean find(int search) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) return true;
        }
        return false;
    }

    // Удаление ---------------------------------------------------------------------------------------------------

    public void delete(int search) {
        int i = 0;
        for (i = 0; i < size; i++) {
            if (arr[i] == search) break;
        }

        for (int j = i; j < size - 1; j++) {
            this.arr[j] = arr[j + 1];
        }
        size--;
    }

    // Вставка ----------------------------------------------------------------------------------------------------

    public void insert(int number) {
        arr[size] = number;
        size++;
    }

    // Меняем элементы местами ------------------------------------------------------------------------------------

    private void change(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    // Сортировка пузырьком ---------------------------------------------------------------------------------------

    public void sortBubbleInt() {
        int out, in;
        for (out = size - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > (arr[in + 1])) {
                    change(in, in + 1);
                }
            }
        }
    }

    // Сортировка выбором -----------------------------------------------------------------------------------------

    public void sortSelectInt() {
        int out, in, marker;
        for (out = 0; out < size; out++) {
            marker = out;
            for (in = out + 1; in < size; in++) {
                if (arr[in] < (arr[marker])) {
                    marker = in;
                }
            }
            change(out, marker);
        }
    }

    // Сортировка вставкой ---------------------------------------------------------------------------------------

    public void sortInsertObjectInt() {
        int in, out;
        for (out = 1; out < size; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] > temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
}

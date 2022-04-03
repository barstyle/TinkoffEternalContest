/*
Проходит всего три теста #пичальбида
 */
package Task_07;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_07 {
    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt(); // количество учеников
        int[] students = new int[count]; // список учеников по номерам

        for (int i = 0; i < count; i++) {
            students[i] = scanner.nextInt();
        }
        // sorted
        int low = 0;
        int high = students.length - 1;
        quickSort(students, low, high);

        int minValue = students[low];
        int maxValue = students[high];

        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] res = {-1, -1};

        for (int i = minValue; i <= maxValue; i++) {
            if (!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }

        if (arrayList.size() < count) System.out.println("-1 -1");
        else {
            for (int i = 0; i < students.length; i ++) {
                if (students[i] != arrayList.get(i)) {
                    res[0] = students[i];
                    res[1] = arrayList.get(i);
                }
            }
            System.out.println(res[0] + " " + res[1]);
        }
    }
}

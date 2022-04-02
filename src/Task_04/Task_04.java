package Task_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Task_04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int amountOfNumbers = scanner.nextInt(); // кол-во чисел
        int numberOfOperations = scanner.nextInt(); // число операций

        int[] listNumbers = new int[amountOfNumbers]; // числа на листочке

        for (int i = 0; i < amountOfNumbers; i++) {
            listNumbers[i] = scanner.nextInt();
        }

        ArrayList<Integer> operations = new ArrayList();


        for (int number : listNumbers) {
            int len = String.valueOf(number).length() - 1;
            for (int i = 0; i <= len; i++) {
                String num = String.valueOf(number).substring(len - i, len - i + 1);
                int operation;
                operation = ((int) Math.pow(10, i)) * (9 - Integer.valueOf(num));
                operations.add(operation);

            }
        }
        Collections.sort(operations);
        Collections.reverse(operations);

        long result = 0;

        if (numberOfOperations > operations.size()) numberOfOperations = operations.size();

        for (int j = 0; j < numberOfOperations; j++) {
            result = result + operations.get(j);
        }

        System.out.println(result);

    }
}

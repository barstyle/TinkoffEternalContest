package Task_03;

import java.util.Arrays;
import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        int[] floorNumbers;

        Scanner scanner = new Scanner(System.in);

        int numberOfStaff = scanner.nextInt(); // кол-во сотрудников
        int timeToLeave = scanner.nextInt(); // время через которое уйдет один сотрудник

        floorNumbers = new int[numberOfStaff];

        for (int i = 0; i < numberOfStaff; i++) {
            floorNumbers[i] = scanner.nextInt();
        }

        int indexStaff = scanner.nextInt();

        int leftFloors = floorNumbers[indexStaff - 1] - floorNumbers[0];
        System.out.println("left - " + leftFloors);
        int rightFloors = floorNumbers[numberOfStaff - 1] - floorNumbers[indexStaff - 1];
        System.out.println("right - " + rightFloors);

        int result = floorNumbers[numberOfStaff - 1] - floorNumbers[0];

        if (leftFloors < rightFloors) {
            if (leftFloors > timeToLeave) {
                result = result + leftFloors;
            }
        } else {
            if (rightFloors > timeToLeave) {
                result = result + rightFloors;
            }
        }

        System.out.println(result);
        System.out.println("index " + indexStaff + "; floor " + floorNumbers[indexStaff - 1]);
        System.out.println("floorNumbers " + Arrays.toString(floorNumbers));

    }
}

package Task_05;

import java.util.Scanner;

public class Task_05 {

    public static int countDigit(long number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNum = scanner.nextLong(); // первое число
        long lastNum = scanner.nextLong(); // последнее число

        int count = 0;
        long repDigit;

        int maxLen = countDigit(lastNum);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= maxLen; j++) {
                try {
                    String letter = String.valueOf(i);
                    String num = "";
                    for (int k = 0; k < j; k++) {
                        num = num + letter;
                    }
                    repDigit = Long.parseLong(num);
                    if (repDigit >= firstNum && repDigit <= lastNum) {
                        count++;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        System.out.println(count);
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Forth_Task {
    public static int ascOrder(int number) {
        int counter = 1;
        int lengthNum = 1;
        int returnNum = number;
        number = Math.abs(number);
        while (number > 0) {
            lengthNum++;
            int endNum = number % 10;
            number /= 10;
            if (endNum - 1 == number % 10) {
                counter++;
            }
            number /= 10;
        }
        if (returnNum == 0 | lengthNum == 1 | (lengthNum != counter)) {
            return 0;
        } else {
            return returnNum;
        }
    }

    public static void main(String[] args) {

        int[] digits = new int[]{1, 23, 454, 454, 34234, 342342, 6789,123456};
        System.out.println("Массив:" + Arrays.toString(digits));
        String printLine = " ";
        for (int digit : digits) {
            if (ascOrder(digit) != 0) {
                printLine += digit + " ";
            }
        }
        System.out.println("Числа которые идут в порядке возрастания :" + printLine);
    }
}

import java.util.Arrays;


public class Forth_Task {
    public static int ascOrder(int number) {
        String numberStr = Integer.toString(number);
        int lengthNum = 1;
        int firstDigit = numberStr.charAt(0) - '0';
        // Итерируемся по символам строки и выводим их
        for (int i = 1; i < numberStr.length(); i++) {
            int digit = numberStr.charAt(i) - '0';
            if (digit == firstDigit + 1) {
                firstDigit = digit;
                lengthNum++;
            } else {
                break;
            }
        }
        if ((Math.abs(number) >= 0 & Math.abs(number) <= 9) | lengthNum == 1 | (lengthNum != numberStr.length())) {
            return 0;
        } else {
            return number;
        }
    }

    public static void main(String[] args) {
        int[] digits = new int[]{895612, 454, 454, 34234, 342342, 6789, 123456, 1, 0, 2, 4};
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

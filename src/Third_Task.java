import java.util.Arrays;
import java.util.Scanner;

public class Third_Task {
    public static int getNumberLength(int number) {
        int length = 0;
        number = Math.abs(number);
        if (number == 0) {
            return 1;
        } else {
            while (number > 0) {
                number /= 10;
                length++;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int lengthMassive = scanner.nextInt();
        int[] digits = First_Task.randomNumberMassive(lengthMassive);
        //int[] digits=new int[]{1,23,454,454,34234,342342};
        System.out.println(Arrays.toString(digits));
        int[] numbersLength = new int[digits.length];
        for (int x = 0; x < digits.length; x++) {
            numbersLength[x] = getNumberLength(digits[x]);
        }
        int maxNumber = numbersLength[0];
        int minNumber = numbersLength[0];
        for (int i = 1; i < numbersLength.length; i++) {
            if (numbersLength[i] > maxNumber) {
                maxNumber = numbersLength[i];
            }
            if (numbersLength[i] < minNumber) {
                minNumber = numbersLength[i];
            }
        }
        String minNumberString="";
        String maxNumberString="";
        for (int x=0;x<digits.length ;x++) {
            if (maxNumber == numbersLength[x]) {
                maxNumberString+=digits[x] + " ";
            } else if (minNumber == numbersLength[x]) {
                minNumberString+=digits[x] + " ";
            }
        }
        System.out.println("Числа с максимальной длиной: " + maxNumberString);
        System.out.println("Числа с минимальной длиной: " + minNumberString);
    }
}

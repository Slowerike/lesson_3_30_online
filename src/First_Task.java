import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class First_Task {
    public static int[] randomNumberMassive(int lengthMassiveFromConsole) {
        Random randomNumber = new Random();
        int[] massiveWithRandomNumber = new int[lengthMassiveFromConsole];
        for (int i = 0; i < massiveWithRandomNumber.length; i++) {

            massiveWithRandomNumber[i] = randomNumber.nextInt(2100000) - 1000000;
        }
        return massiveWithRandomNumber;

    }
    /**
     * метод randomNumberMassive выводит рандом число от -1000000 до +1000000
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int lengthMassive = scanner.nextInt();

        int[] digits = randomNumberMassive(lengthMassive);
        System.out.println(Arrays.toString(digits));
        int max = digits[0];
        int min = digits[0];
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] > max) {
                max = digits[i];
            }
            if (digits[i] < min) {
                min = digits[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }
}
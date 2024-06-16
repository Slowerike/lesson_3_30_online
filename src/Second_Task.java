import java.util.Arrays;
import java.util.Scanner;

public class Second_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int lengthMassive = scanner.nextInt();
        int[] digits = First_Task.randomNumberMassive(lengthMassive);
        System.out.println(Arrays.toString(digits));
        String evenNumber = "";
        String oddNumber = "";
        for (int digit : digits) {
            if (digit % 2 == 0) {
                evenNumber += digit + " ";

            } else {
                oddNumber += digit + " ";
            }
        }
        System.out.println("Четные числа: " + evenNumber);
        System.out.println("Нечетные числа: " + oddNumber);
    }
}

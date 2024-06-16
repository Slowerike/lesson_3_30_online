public class Fifth_Task {
    public static boolean palindromeCheker(int number) {
        int lengthNumber = 0;
        int innerNUmber = number;
        boolean isEqual = true;
        while (number > 0) {
            number /= 10;
            lengthNumber++;
        }
        int[] localMassive = new int[lengthNumber];
        for (int i = 0; i < localMassive.length; i++) {
            localMassive[i] = innerNUmber % 10;
            innerNUmber /= 10;
        }
        if (lengthNumber == 0) {
            return false;
        }
        if (lengthNumber % 2 == 0) {
            for (int i = 0; i < localMassive.length / 2; i++) {
                if (localMassive[i] != localMassive[localMassive.length - 1 - i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < localMassive.length / 2; i++) {
                if (localMassive[i] != localMassive[localMassive.length - 1 - i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        return isEqual;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{101, 2332, 454, 454, 34234, 342342, 6789, 123456, 123464321};
        for (int digit : digits) {
            if (palindromeCheker(digit)) {
                System.out.println(digit);
            }
        }
    }
}

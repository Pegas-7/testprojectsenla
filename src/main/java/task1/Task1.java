package task1;

import java.math.BigInteger;

import static helpers.HelperMethods.readInteger;

/*
1. Создать программу, которая будет сообщать, является ли целое число, введенное пользователем, чётным или нечётным,
 простым или составным.  Если пользователь введёт не целое число, то сообщать ему об ошибке.
*/

public class Task1 {
    public static void main(String[] args) {

        int n = readInteger();
        isEvenNumber(n);
    }

    private static void isEvenNumber(int n) {
        if (n % 2 == 0 && n > 1) {
            System.out.println("Entered even, composite number");
            return;
        }
        if (n % 2 == 0 && n <= 1) {
            System.out.println("Entered even, no composite and no prime number");
        } else {
            System.out.println("Entered odd, " + compositeOrPrimeNumber(n) +
                    " number");
        }
    }

    private static String compositeOrPrimeNumber(int n) {
        String typeNumber = "composite";
        boolean probablePrime = false;

        BigInteger bigInteger = BigInteger.valueOf(n);
        probablePrime = bigInteger.isProbablePrime((int) Math.log(n));

        if (probablePrime && n > 1) {
            return typeNumber = "prime";
        }
        if (n > 1) return typeNumber = "composite";
        else return typeNumber = "no composite and no prime";
    }
}

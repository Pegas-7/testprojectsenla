package task1;

import java.math.BigInteger;

import static helpers.HelperMethods.getIntegerNumber;

public class Task1 {
    public static void main(String[] args) {

        int n = getIntegerNumber();
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
            System.out.println("Entered odd, " + CompositeOrPrimeNumber(n) +
                    " number");
        }
    }

    private static String CompositeOrPrimeNumber(int n) {
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

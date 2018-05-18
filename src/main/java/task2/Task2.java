package task2;

import static helpers.HelperMethods.getIntegerNumber;

public class Task2 {
    public static void main(String[] args) {
        int n1 = getIntegerNumber();
        int n2 = getIntegerNumber();

        printScreenSum(n1, n2);
        printScreenDifference(n1, n2);
        printScreenGcd(n1, n2);
        printScreenLcm(n1, n2);
    }

    private static void printScreenGcd(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);

        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 %= n2;
            } else {
                n2 %= n1;
            }
        }
        System.out.println("GCD of entered numbers " + (n1 + n2));
    }

    private static void printScreenLcm(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            System.out.println("Entered numbers have not LCM");
            return;
        }

        int j;

        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        if (n1 < n2) j = n1;
        else j = n2;

        boolean t = true;

        while (t) {
            if ((j % n2 == 0) && (j % n1 == 0)) break;
            else j += 1;
        }

        System.out.println("LCM of entered numbers " + j);
    }

    private static void printScreenDifference(int n1, int n2) {
        System.out.println("Difference of entered numbers " + (n1 - n2));
    }

    private static void printScreenSum(int n1, int n2) {
        System.out.println("Sum of entered numbers " + (n1 + n2));
    }
}

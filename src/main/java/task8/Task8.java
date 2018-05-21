package task8;

/*
8.	Написать программу, которая в последовательности от 0 до N, находит все числа-палиндромы (зеркальное значение равно
 оригинальному). Длина последовательности вводится вручную и не должна превышать 100.
*/

import java.util.ArrayList;
import java.util.List;

import static helpers.HelperMethods.getIntegerNumber;

public class Task8 {
    static int sizeSequence = 0;

    public static void main(String[] args) {
        sizeSequence = getLengthOfSequence();

        List<Integer> listWithPalindromes = findPalindromesNumber(sizeSequence);

        System.out.println("This palindromes numbers from sequence " + listWithPalindromes);
    }

    public static int getLengthOfSequence() {
        int sizeSequence;

        while (true) {
            System.out.println("Specify the length of the sequence. Range of numbers from 1 to 100");

            sizeSequence = getIntegerNumber();

            if (sizeSequence > 100) {
                System.out.println("Entered number greatest than 100 or less than 1");
            } else break;
        }

        return sizeSequence;
    }

    public static List<Integer> findPalindromesNumber(int N) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            if (isPalindrome(i)) list.add(i);
        }

        return list;
    }

    public static boolean isPalindrome(int number) {
        String n = String.valueOf(number);
        return n.equalsIgnoreCase(new StringBuilder(n).reverse().toString());
    }
}

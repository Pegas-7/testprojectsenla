package task9;

/*
9.	Написать программу выводящую на экран все четные числа и их сумму из последовательности от 0 до N. N вводится
вручную.
*/

import java.util.ArrayList;
import java.util.List;

import static helpers.HelperMethods.readInteger;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Specify the length of the sequence");

        int sizeSequence = readInteger();

        List<Integer> evenNumbers = findEvenNumber(sizeSequence);

        System.out.println("This all even number from sequence " + evenNumbers);

        System.out.println("Sum even numbers of sequence is " + getSumElementsOfArray(evenNumbers));
    }

    public static int getSumElementsOfArray(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;
    }

    public static List<Integer> findEvenNumber(int N) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            if (isEvenNumber(i)) list.add(i);
        }

        return list;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) return true;
        return false;
    }
}

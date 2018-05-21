package task7;

/*
7.	Написать программу, которая рандомно генерирует массив 2-ух значных чисел длины N (вводится вручную) и выводит
наименьшее и наибольшее число из списка.
*/

import java.util.ArrayList;
import java.util.List;

import static helpers.HelperMethods.getIntegerNumber;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Specify the length of the array");
        List<Integer> numbers = numberGenerator(getIntegerNumber());
        System.out.println(numbers);
        int greatestNumber = seekingGreatestNumber(numbers);
        int smallestNumber = seekingSmallestNumber(numbers);

        if (greatestNumber == 0 || smallestNumber == 100) {
            System.out.println("This array doesn't contain something numbers");
        } else {
            System.out.println("Greatest number in the array is " + greatestNumber);
            System.out.println("Smallest number in the array is " + smallestNumber);
        }
    }

    public static int seekingGreatestNumber(List<Integer> numbers) {
        int n = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > n) n = numbers.get(i);
        }

        return n;
    }

    public static int seekingSmallestNumber(List<Integer> numbers) {
        int n = 100;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < n) n = numbers.get(i);
        }

        return n;
    }

    public static List<Integer> numberGenerator(int N) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            list.add((int) (Math.random() * 50 + 50));
        }

        return list;
    }
}

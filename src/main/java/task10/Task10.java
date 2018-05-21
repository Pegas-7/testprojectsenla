package task10;

/*
10.	Написать программу, составляющую всевозможные комбинации 3-х значных чисел из 3-х введенных пользователем цифр.
Цифры вводятся вручную.
*/

import java.util.ArrayList;
import java.util.List;

import static helpers.HelperMethods.getIntegerNumber;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Enter three numbers");

        int firstNumber = getIntegerNumber();
        int secondNumber = getIntegerNumber();
        int thirdNumber = getIntegerNumber();

        List<Integer> list = threeDigitNumberGenerator(firstNumber, secondNumber, thirdNumber);

        System.out.println("This all combination three-digit numbers from entered numbers " + list);
    }

    public static List<Integer> threeDigitNumberGenerator(int firstNumber, int secondNumber, int thirdNumber) {
        List<Integer> list = new ArrayList<Integer>();

        int n = 0;

        n = firstNumber * 100 + secondNumber * 10 + thirdNumber;
        if (!list.contains(n)) list.add(n);
        n = firstNumber * 100 + thirdNumber * 10 + secondNumber;
        if (!list.contains(n)) list.add(n);
        n = secondNumber * 100 + thirdNumber * 10 + firstNumber;
        if (!list.contains(n)) list.add(n);
        n = secondNumber * 100 + firstNumber * 10 + thirdNumber;
        if (!list.contains(n)) list.add(n);
        n = thirdNumber * 100 + firstNumber * 10 + secondNumber;
        if (!list.contains(n)) list.add(n);
        n = thirdNumber * 100 + secondNumber * 10 + firstNumber;
        if (!list.contains(n)) list.add(n);

        return list;
    }
}

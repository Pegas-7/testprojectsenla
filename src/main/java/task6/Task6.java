package task6;

/*
6.	Написать программу, которая проверяет три отрезка на возможность создать прямоугольный треугольник. Длина отрезков
вводится вручную.
*/

import static helpers.HelperMethods.readInteger;

public class Task6 {
    public static void main(String[] args) {

        int lengthFirstLine = readInteger();
        int lengthSecondLine = readInteger();
        int lengthThirdLine = readInteger();

        if (checkLinesRightTriangle(lengthFirstLine, lengthSecondLine, lengthThirdLine))
            System.out.println("This is a right triangle");
        else System.out.println("This is not a right triangle");

    }

    private static boolean checkLinesRightTriangle(int firstLine, int secondLine, int thirdLine) {
        if (firstLine > secondLine) {
            int a = firstLine;
            firstLine = secondLine;
            secondLine = a;
        }

        if (secondLine > thirdLine) {
            int b = thirdLine;
            thirdLine = secondLine;
            secondLine = b;

            if (firstLine > secondLine) {
                int a = firstLine;
                firstLine = secondLine;
                secondLine = a;
            }
        }

        if ((Math.pow(firstLine, 2) + Math.pow(secondLine, 2)) == Math.pow(thirdLine, 2)) return true;

        return false;
    }
}
package task3;

import static helpers.HelperMethods.readString;

/*
3.	Необходимо написать программу, которая проверяет слово на "палиндромность". Слово для проверки вводится вручную во
время выполнения программы.
*/

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the word to check for polydromy, than press \"Enter\"");

        if (isPalindrome(readString())){
            System.out.println("Entered word is palindrome");
        }
        else System.out.println("Entered word is not palindrome");
    }

    public static boolean isPalindrome(String text) {
        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }
}

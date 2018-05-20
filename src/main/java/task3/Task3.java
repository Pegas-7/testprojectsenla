package task3;

import static helpers.HelperMethods.readString;

/*
3.	Необходимо написать программу, которая проверяет слово на "палиндромность". Слово для проверки вводится вручную во
время выполнения программы.
*/

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the string to check for polydromy, than press \"Enter\"");
        if (isPalindrome(readString())){
            System.out.println("Entered string is palindrome");
        }
        else System.out.println("Entered string is not palindrome");
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","").replaceAll("\\_","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W","").replaceAll("\\_",""))
                        .reverse().toString());
    }
}

package task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static helpers.HelperMethods.readString;

/*
4.	Создать программу, которая будет подсчитывать количество слов в предложении и выводить их в отсортированном виде.
Предложение вводится вручную. (Разделители пробел (“ ”) и запятая (“,”)).
*/

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the string, than press \"Enter\"");

        List<String> list = getListWordsFromString(readString());

        System.out.println("Amount of words " + list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> getListWordsFromString(String s) {
        List<String> list1 = Arrays.asList(s.replaceAll(",", "").split("\\s"));
        List<String> list2 = new ArrayList<String>();

        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals("")) list2.add(list1.get(i));
        }
        return list2;
    }
}

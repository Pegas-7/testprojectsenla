package task5;

/*
5.	Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра) . Текст и
слово вводится вручную.
*/

import java.util.ArrayList;
import java.util.List;

import static helpers.HelperMethods.readString;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the text, than press \"Enter\"");

        String text = readString();

        System.out.println("Enter the word, than press \"Enter\"");

        String word = readString();

        System.out.println("This text contains " + wordsCounter(text,word)+" word(s) " + word);
    }

    public static int wordsCounter(String text, String word) {

        List<String> letterFromString = addLettersFromStringToArray(text);
        List<String> letterFromWord = addLettersFromStringToArray(word);

        return wordsСomparator(letterFromString, letterFromWord);
    }

    public static int wordsСomparator(List<String> letterFromString, List<String> letterFromWord) {
        int letterCounter = 0;

        for (int i = 0; i < letterFromString.size(); i++) {
            if (letterFromString.get(i).equalsIgnoreCase(letterFromWord.get(0))) {
                int n = i;

                for (int r = 0; r < letterFromWord.size(); r++) {
                    if (letterFromWord.get(r).equalsIgnoreCase(letterFromString.get(n))) {
                        n++;
                        letterCounter++;
                        continue;
                    } else {
                        letterCounter = letterCounter-r;
                        break;
                    }
                }
            }
        }

        return letterCounter/letterFromWord.size();
    }

    public static List<String> addLettersFromStringToArray(String text) {
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < text.length(); i++) {
            list.add(text.substring(i, i + 1));
        }

        return list;
    }
}

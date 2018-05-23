package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;

/**
 * Created by Evgeni Kuntsevich on 02.09.2016.
 */

public class HelperMethods {
    public static String readString() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = "";

        try {
            inputString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputString;
    }


    public static int readInteger() {
        int n = 0;
        String number = "";

        while (true) {
            try {
                System.out.println("Enter integer number, press \"Enter\"");
                number = readString();
                n = parseInt(number);
                if (n % 1 == 0) return n; //check for integer
            } catch (NumberFormatException e) {
                System.out.println("Entered no integer number, please try again");
                continue;
            }
            return n;
        }
    }
}

package app;

import static java.lang.Character.*;

public class StringListProcessor {
    public static int countUppercase(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

}
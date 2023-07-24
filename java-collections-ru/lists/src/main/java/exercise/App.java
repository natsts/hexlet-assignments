package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String letters, String word) {

        ArrayList<Character> arrayOfLetters = getCharsList(letters);
        ArrayList<Character> arrayOfword = getCharsList(word);

        boolean result = false;

        for (Character symbol: arrayOfword) {
            if (arrayOfLetters.contains(symbol)) {
                result = true;
                arrayOfLetters.remove(arrayOfLetters.indexOf(symbol));
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static ArrayList<Character> getCharsList(String str) {

        String strOfLowerCase = str.toLowerCase();

        char[] array = strOfLowerCase.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<>();

        for (Character symbol: array) {
            arrayList.add(symbol);
        }

        return arrayList;
    }
}
//END

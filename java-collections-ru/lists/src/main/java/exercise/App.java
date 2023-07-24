package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String symbols, String word) {

        String[] letters = symbols.split("");

        List<String> array = new ArrayList(Arrays.asList(letters));

        for (var i = 0; i < word.length(); i++) {
            String current = word.substring(i, i + 1).toLowerCase();

            if (!array.contains(current)) {
                return false;
            }
            array.remove(current);
        }
        return true;
    }
}
//END

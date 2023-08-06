package exercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {

    public static Map<String, Integer> getWordCount(String sentence) {

        String[] wordsOfSentence = sentence.split(" ");
        HashMap<String, Integer> listOfWords = new HashMap<String, Integer>();

        if (sentence.length() == 0) {
            return listOfWords;
        }

        for (String word : wordsOfSentence) {
            var value = listOfWords.get(word);
            listOfWords.put(word, value == null ? 1 : value + 1);
        }
        return listOfWords;
    }

    public static String toString(Map<String, Integer> list) {
        String result = "{\n";

        if (list.isEmpty()) {
            return "{}";
        }

        for (Map.Entry<String, Integer> item: list.entrySet()) {
            result += "  " + item.getKey() + ": " + item.getValue() + "\n";
        }
        result += "}";

        return result;
    }
}
//END

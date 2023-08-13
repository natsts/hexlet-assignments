package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
class App {

    public static long getCountOfFreeEmails(List<String> emails) {
        long result = emails.stream()
                .filter(email -> !email.isEmpty())
                .filter(email -> isContainsFreeHost(email))
                .count();
        return result;
    }

    public static boolean isContainsFreeHost(String email) {
        String[] words = email.split("@");
        for (String word: words) {
            if (word.equals("gmail.com") || word.equals("yandex.ru") || word.equals("hotmail.com")) {
                return true;
            }
        }
        return false;
    }
}
// END

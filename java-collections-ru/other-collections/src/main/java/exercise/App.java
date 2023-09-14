package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static LinkedHashMap<String, Object> genDiff(Map<String, Object> one, Map<String, Object> two) {

        Map<String, Object> map = new HashMap<>();
        map.putAll(one);
        map.putAll(two);

        LinkedHashMap<String, Object> result = new LinkedHashMap<>();

        for (Map.Entry<String, Object> entry: map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if (!one.containsKey(key)) {
                result.put(key, "added");
            } else if (!two.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!one.containsValue(two.get(key))) {
                result.put(key, "changed");
            } else if (one.containsValue(two.get(key))) {
                result.put(key, "unchanged");
            }
        }
        System.out.println(result);
        return result;
    }
}
//END

package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
class App {
    public static String getForwardedVariables(String config) {

        String[] lines = config.split("\n");

        return Arrays.stream(lines)
                .filter(line -> line.startsWith("environment"))
                .map(line -> line.replaceAll("environment=", ""))
                .map(line -> line.replaceAll("\"", ""))
                .map(line -> line.split(","))
                .flatMap(Arrays::stream)
                .filter(line -> line.startsWith("X_FORWARDED_"))
                .map(line -> line.replaceFirst("X_FORWARDED_", ""))
                .map(line -> line.trim())
                .collect(Collectors.joining(","));
    }
}
//END

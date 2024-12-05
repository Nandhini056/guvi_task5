import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("abc", "", " bc", "efg", "", " jkl");

        // Filter out empty strings and print the result
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.trim().isEmpty())
                .collect(Collectors.toList());

        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}
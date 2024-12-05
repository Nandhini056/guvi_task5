import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> names = Stream.of("aBc", "d", " ef")
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Print the list
        System.out.println(names);
    }
}
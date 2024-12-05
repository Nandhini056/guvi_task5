import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        // Create a list of student names
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Arun");
        studentNames.add("Bharti");
        studentNames.add("Aryan");
        studentNames.add("Chikku");
        studentNames.add("Aarav");
        studentNames.add("Disha");
        studentNames.add("Aisha");
        studentNames.add("Eshaan");
        studentNames.add("Apeksha");

        // Print the original list
        System.out.println("Original List:");
        System.out.println(studentNames);

        // Use lambda expression and Stream API to filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        // Print the list of students whose names start with "A"
        System.out.println("\nStudents whose names start with 'A':");
        System.out.println(studentsWithA);
    }
}
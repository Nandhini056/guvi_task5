import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth date (yyyy-mm-dd): ");
        String birthDateInput = scanner.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = LocalDate.parse(birthDateInput, formatter);
            LocalDate today = LocalDate.now();

            int years = today.getYear() - birthDate.getYear();
            int months = today.getMonthValue() - birthDate.getMonthValue();
            int days = today.getDayOfMonth() - birthDate.getDayOfMonth();

            if (months < 0) {
                years--;
                months += 12;
            }

            if (days < 0) {
                months--;
                days += today.lengthOfMonth();
            }

            System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        }
    }
}
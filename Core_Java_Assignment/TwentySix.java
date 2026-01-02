import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter starting date (DD-MM-YYYY): ");
        String start = sc.nextLine();

        System.out.print("Enter ending date (DD-MM-YYYY): ");
        String end = sc.nextLine();

        LocalDate startDate = LocalDate.parse(start, formatter);
        LocalDate endDate = LocalDate.parse(end, formatter);

        long days = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("Number of days: " + days);
        sc.close();
    }
}

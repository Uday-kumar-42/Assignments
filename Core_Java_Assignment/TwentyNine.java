import java.util.Scanner;

public class TwentyNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter 5 numeric strings:");

        for (int i = 1; i <= 5; i++) {
            String input = sc.nextLine();
            try {
                total += Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number ignored: " + input);
            }
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}


import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking day as an input
        System.out.print("Day of the week(1-7) : ");
        int day = sc.nextInt();

        // check whether input day is valid or not
        if (day < 1 || day > 7) {
            System.out.println("Invlid day value");
            sc.close();
            return;
        }

        // taking hour as an input
        System.out.print("No:of hours worked : ");
        int hours = sc.nextInt();

        // check whether input hour is valid or not
        if (hours < 0 || hours > 24) {
            System.out.println("Invlid hour value");
            sc.close();
            return;
        }

        double totalWage = 0;

        switch (day) {
            case 1:
            case 2:
            case 3:
                totalWage = hours * 200;
                break;
            case 4:
            case 5:
                totalWage = hours * 400;
                break;
            case 6:
                totalWage = hours * 600;
                break;
            case 7:
                totalWage = hours * 800;
                break;
            default:
                break;
        }

        if (totalWage > 2000) {
            totalWage += totalWage * (0.1);
        }
        System.out.println("Total wage earned : " + totalWage);

        sc.close();
    }
}

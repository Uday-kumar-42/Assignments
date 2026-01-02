import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt();
            sum += num;
        }

        System.out.println("Average of the five numbers is : " + (double) sum / 5);
        sc.close();
    }
}

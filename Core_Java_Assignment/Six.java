import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;

        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                ans = i;
            }
        }

        System.out.println("Largest factor for the provided number is : " + ans);
        sc.close();
    }
}

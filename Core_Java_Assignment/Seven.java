import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int ans = 0;

        while (temp > 0) {
            int rem = temp % 10;
            ans += ans * 10 + rem;
            temp = temp / 10;
        }

        System.out.println("Reversed number of the provided number : " + ans);

        temp = num;
        System.out.print("Reverse order of the provided number : ");
        while (temp > 0) {
            int rem = temp % 10;
            System.out.print(rem);
            temp = temp / 10;
        }

        System.out.println();
        sc.close();
    }
}

import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i] = val;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.printf("arr[%d] = %d \n", i, arr[i]);
        }

        sc.close();
    }
}

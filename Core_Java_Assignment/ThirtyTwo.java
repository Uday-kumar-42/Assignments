import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while(true) {
            String s = sc.next();
            if(s.toUpperCase().equals("O")) break;

            int n = Integer.parseInt(s);
            if(n > 0) sum += n;
        }
        System.out.println(sum);
        sc.close();
    }
}

import java.util.Scanner;
public class FourtFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(String s : sc.nextLine().split("\\s+")) {
            System.out.println(s);
        }
        sc.close();
    }
}

import java.util.Scanner;

public class FourtyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pan = sc.next();
        System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"));
        sc.close();
        
    
    }
}

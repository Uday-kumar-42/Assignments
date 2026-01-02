import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 25);
        int chances = 3;
        boolean flag = false;

        System.out.println("Guess the number(1-25)");
        System.out.println("No:of chances left : " + chances);

        while (chances > 0) {
            int guessedNumber = sc.nextInt();
            System.out.println(guessedNumber);
            if (guessedNumber == randomNumber) {
                flag = true;
                break;
            }

            System.out.println("No:of chances left : " + --chances);
        }

        if (flag == true) {
            System.out.println("That's correct");
            System.out.println("the random number is : " + randomNumber);
        } else {
            System.out.println("Better luck next time");
            System.out.println("the random number is : " + randomNumber);
        }

        sc.close();
    }
}

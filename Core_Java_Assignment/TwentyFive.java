import java.util.*;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        while (true) {
            System.out.print("Enter name (END to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("END")) {
                break;
            }
            names.add(name);
        }

        System.out.println(String.join("-", names));
        sc.close();
    }
}

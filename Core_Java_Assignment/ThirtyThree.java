import java.util.*;
import java.io.*;
public class ThirtyThree {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("names.txt")) {

            while (true) {
                String name = sc.nextLine();
                if (name.toUpperCase().equals("END"))
                    break;
                fw.write(name + "\n");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
        
    }
}

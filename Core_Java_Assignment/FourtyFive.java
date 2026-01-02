import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FourtyFive {
    public static void main(String[] args) {
        try {
            System.out.println("Enter file name:");
            Scanner sc = new Scanner(System.in);
            File file = new File(sc.next());

        BufferedReader br = new BufferedReader(new FileReader(file));
        StringBuilder sb = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line.replaceAll("\\s+", " "));
            sb.append("\n");
        }
        sc.close();
        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write(sb.toString());
        bw.close();
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
       
    
}
}
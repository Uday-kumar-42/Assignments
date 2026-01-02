import java.io.BufferedReader;
import java.io.FileReader;

public class ThirtySix {
    public static void main(String[] args) {
 try{
        BufferedReader br = new BufferedReader(new FileReader("Marks.txt"));
        String line;

        while ((line = br.readLine()) != null) {
            int sum = 0;
            for (String s : line.split(",")) {
                try {
                    sum += Integer.parseInt(s);
                } catch (Exception e) {
                }
            }
            System.out.println(sum);
        }
        br.close();
    }
    catch(Exception e){
        System.out.println("An error occurred: " + e.getMessage());
    }
}
    }

    


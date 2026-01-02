import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirtySeven {
    public static void main(String[] args) {
        try{
                Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("marks.data", true);

                for (int i = 1; i <= 20; i++) {
                    fw.write(sc.nextInt() + "\n");
                }
                fw.close();
                sc.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
       
    }
}

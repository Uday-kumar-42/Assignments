import java.io.BufferedReader;
import java.io.FileReader;

public class ThirtyFive {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line=br.readLine())!=null)
            if (line.length() > 5)
                System.out.println(line);
        br.close();
    }
}

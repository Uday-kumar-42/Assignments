import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FourtyEight {
    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("customers.txt"));
            String line;

            Pattern p = Pattern.compile("([A-Za-z]+)\\s+([6-9][0-9]{9})");

            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);

                if (m.matches()) {
                    map.put(m.group(1), m.group(2));
                }
            }

            br.close();

            for (Map.Entry<String, String> e : map.entrySet()) {
                System.out.println(e.getKey() + " " + e.getValue());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

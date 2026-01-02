import java.io.*;
import java.util.*;
public class FourtySix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings.....");
        System.out.println("  Enter end to stop");
        List<String> li = new ArrayList<>();
        String s;
        while (true) {
            s = sc.next();
            if (s.toLowerCase().equals("end"))
                break;
            li.add(s);
        }
        sc.close();
        Collections.sort(li);
        File ff = new File("codes.txt");
        try{
            FileWriter fw = new FileWriter(ff);
            BufferedWriter bf = new BufferedWriter(fw);
            for (String st : li) {
                if (!st.matches("[a-zA-z]+[0-9]+"))
                    continue;
                bf.write(st);
                bf.newLine();

            }
            bf.close();
            fw.close();
            System.out.println("written sucessfull");

        }
        catch (IOException e) {
            System.out.println("exception occured " + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}

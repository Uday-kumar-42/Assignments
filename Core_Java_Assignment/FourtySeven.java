import java.io.*;
import java.util.*;


public class FourtySeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter directory path: ");
            String path = sc.nextLine();

            System.out.print("Enter string to search: ");
            String key = sc.nextLine();

            File dir = new File(path);

            if (!dir.isDirectory()) {
                System.out.println("Invalid directory path");
                return;
            }

            File[] files = dir.listFiles();

            if (files == null) {
                System.out.println("No files found");
                return;
            }

            for (File f : files) {
                if (f.isFile()) {
                    BufferedReader br = new BufferedReader(new FileReader(f));
                    String line;

                    while ((line = br.readLine()) != null) {
                        if (line.contains(key)) {
                            System.out.println(f.getName());
                            break;   
                        }
                    }
                    br.close();
                }
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

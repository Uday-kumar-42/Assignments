import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.TreeSet;
public class ThirtyNine {
    public static void main(String[] args) {
        try{
            TreeSet<String> set = new TreeSet<>();
            for (String line : Files.readAllLines(Paths.get("names.txt"))) {
                for (String word : line.split("\\W+")) {
                    set.add(word.toLowerCase());
                }
            }
            for (String word : set) {
                System.out.println(word);
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

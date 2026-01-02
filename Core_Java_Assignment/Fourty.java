import java.util.LinkedHashSet;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Fourty {
    public static void main(String[] args) throws Exception {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(Files.readAllLines(Paths.get("names1.txt")));
        set.addAll(Files.readAllLines(Paths.get("names2.txt")));
        set.forEach(System.out::println);

    }
}
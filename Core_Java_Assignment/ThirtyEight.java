import java.nio.file.Files;
import java.nio.file.Paths;
public class ThirtyEight {
    public static void main(String[] args) throws Exception {
        System.out.print(
          new String(
            Files.readAllBytes(
              Paths.get(args[0])
            )
          ).toUpperCase()
        );
    }
}

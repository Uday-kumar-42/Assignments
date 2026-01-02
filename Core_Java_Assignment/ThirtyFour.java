import java.io.*;

public class ThirtyFour {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(args[0]);
        int uc=0, lc=0, d=0, ch;

        while ((ch = fr.read()) != -1) {
            if (Character.isUpperCase(ch))
                uc++;
            else if (Character.isLowerCase(ch))
                lc++;
            else if (Character.isDigit(ch))
                d++;
        }
        fr.close();
        System.out.println(uc+" "+lc+" "+d);
    }
}



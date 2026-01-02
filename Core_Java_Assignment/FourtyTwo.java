import java.util.TreeSet;
public class FourtyTwo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>((a, b) -> a.length() - b.length());
        set.add("apple");
        set.add("banana");
        set.add("kiwi");
        set.add("cherry");
        set.add("blueberry");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}

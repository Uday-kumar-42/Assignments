import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TwentyEight {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 60000));
        products.add(new Product(2, "Mouse", 500));
        products.add(new Product(3, "Keyboard", 1500));

        products.sort(Comparator.comparing(Product::getProductName));
        System.out.println("Sorted by Name: " + products);

        products.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Sorted by Price: " + products);
    }
}
public class Seventeen {
    public static void main(String[] args) {

        Product p1 = new ImportedProduct(101, "Laptop", 50000, 0.10);
        Product p2 = new DiscountedProduct(102, "Mobile", 20000, 0.15);

        p1.print();
        p2.print();

        System.out.println("Total Price of " + p1.getProductName() + " " + p1.getNetPrice());
        System.out.println("Total Price of " + p2.getProductName() + " " + p2.getNetPrice());
    }
}

public class Twelve {
    public static void main(String[] args) {
        Product shirt = new Product(1024, "Shirt", 500);
        shirt.purchase(10);
        System.out.println(shirt.getNetPrice());
        System.out.println(shirt.getProductId());
        shirt.sell(3);
        System.out.println(shirt.getQuantity());
        System.out.println(shirt.getProductName());
    }
}

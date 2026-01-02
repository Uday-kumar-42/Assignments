public class Thirteen {
    public static void main(String[] args) {
        Product anonymousProduct = new Product(1024);
        anonymousProduct.purchase(10);
        System.out.println(anonymousProduct.getNetPrice());
        System.out.println(anonymousProduct.getProductId());
        anonymousProduct.sell(3);
        System.out.println(anonymousProduct.getQuantity());
        System.out.println(anonymousProduct.getProductName());
    }
}

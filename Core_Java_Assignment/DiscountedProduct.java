public class DiscountedProduct extends Product {

    private double discountRate;

    public DiscountedProduct(int id, String name, double price, double discountRate) {
        super(id, name, price);
        this.discountRate = discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getNetPrice() {
        double baseNet = super.getNetPrice();
        return baseNet - (this.price * discountRate);
    }

    @Override
    public void print() {
        System.out.println("Product Name : " + this.getProductName());
        System.out.println("Discount Rate: " + discountRate);
    }
}

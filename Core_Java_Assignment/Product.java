public class Product {
    public static final double TAX_RATE = 0.12;
    public static final double BASE_PRICE = 400;
    private int prod_id;
    private String prod_name;
    protected double price;
    // children classes can access the protected fields
    private int quantity_in_hand;

    public Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_in_hand = 0;
    }

    public Product(int prod_id, String prod_name) {
        this(prod_id, prod_name, BASE_PRICE);
    }

    public Product(int prod_id) {
        this(prod_id, "Anonymous_Item", BASE_PRICE);
    }

        @Override
    public String toString() {
        return prod_id + " " + prod_name + " " + price;
    }

    public double getPrice(){
        return price;
    }

    public int getProductId() {
        return prod_id;
    }

    public String getProductName() {
        return prod_name;
    }

    public void setProductName(String prod_name) {
        this.prod_name = prod_name;
    }

    public int getQuantity() {
        return this.quantity_in_hand;
    }

    public void purchase(int quantity) {
        this.quantity_in_hand += quantity;
    }

    public void sell(int quantity) {
        if (quantity > this.quantity_in_hand) {
            System.out.println("Requested items are more than the quantitty we have");
        } else {
            this.quantity_in_hand -= quantity;
        }
    }

    public double getNetPrice() {
        return (1 + TAX_RATE) * this.price;
    }

    public void print() {
        System.out.println("Product Name : " + this.prod_name);
    }
}

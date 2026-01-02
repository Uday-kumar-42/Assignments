public class ImportedProduct extends Product {

    private double importDuty;

    public ImportedProduct(int id, String name, double price, double importDuty) {
        super(id, name, price);
        this.importDuty = importDuty;
    }

    public void setImportDuty(double importDuty) {
        this.importDuty = importDuty;
    }

    @Override
    public double getNetPrice() {
        double baseNet = super.getNetPrice();
        return baseNet + (this.price * importDuty);
    }

    @Override
    public void print() {
        System.out.println("Product Name : " + this.getProductName());
        System.out.println("Import Duty: " + importDuty);
    }
}

public class Product {
    private String model;
    private String brand;
    private double price;

    public Product(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return("Product:\n"+
                "model: " + this.getModel()+"\n"+
                "brand: " + this.getBrand()+ "\n"+
                "price: " + this.getPrice());
    }
}

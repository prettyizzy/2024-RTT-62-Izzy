package classexamples.coffee_shop;

public class Product {
    // always private
    private double price;
    private String name;
    private boolean beverage;

    // constructor with no args - by default. this is included wiht teh java langauges
    public Product() {

    }

    //constructor with all args
    // it is only if you want to have a custom constructor that you add it
    public Product(double price, String name, boolean beverage) {
        this.price = price;
        this.name = name;
        this.beverage = beverage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }
}

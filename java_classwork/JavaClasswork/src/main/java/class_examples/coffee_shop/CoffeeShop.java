package class_examples.coffee_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CoffeeShop {
    private final List<Product> products = new ArrayList<>();

    public void initProducts() {
        Product coffee = new Product();
        coffee.setPrice(5.46);
        coffee.setName("Small Coffee");
        coffee.setBeverage(true);
        products.add(coffee);

        Product cakePop = new Product();
        cakePop.setPrice(3.89);
        cakePop.setName("Cake Pop");
        cakePop.setBeverage(false);
        products.add(cakePop);

        Product largeCoffee = new Product();
        largeCoffee.setPrice(9.46);
        largeCoffee.setName("Large Coffee");
        largeCoffee.setBeverage(true);
        products.add(largeCoffee);


        Product eggSandwich = new Product(7.89, "Egg Sandwich", false);
        products.add(eggSandwich);

        ProductReader pr = new ProductReader();
        List<Product> productsFromFile = pr.readProducts();
        products.addAll(productsFromFile);
    }

    public void printCheapProducts() {
        List<Product> cheapProducts = products.stream().filter(product -> product.getPrice() < 5).collect(Collectors.toList());

        // this code prints each of the products that is less than 5
       // cheapProducts.forEach(product -> System.out.println(product.getName()) + "");
    }

    //print the list of products available for sale
    public void printProducts(){
        for (int pos = 0; pos < products.size(); pos++) {
            Product product = products.get(pos);
            System.out.println((pos + 1) + ") " + product.getName() + "\t" + product.getPrice());
        }
    }
}

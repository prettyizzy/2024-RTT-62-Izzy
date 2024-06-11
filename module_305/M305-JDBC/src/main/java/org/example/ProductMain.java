package org.example;
import org.example.database.entity.Product;
import org.example.database.dao.ProductDAO;

import java.util.List;
import java.util.Scanner;

public class ProductMain {

    private ProductDAO productDAO = new ProductDAO();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        String productName = inputProductSearch();                      // prompt the user to enter a product name
        List<Product> products = productDAO.findLikeName(productName);  // use our productDAO to run the query
        int productID = printProductsAndPromptForProductId(products);                   // #2 Print the list of products

        Product selected = productDAO.findByID(productID);
        System.out.println(selected);

        int quantity = promptQuantityInStock();
        System.out.println(quantity);
    }

    public int promptQuantityInStock () {
        System.out.println("Enter the new value for quantity in stock: ");
        int quantity = scanner.nextInt();
        return quantity;
    }
    public int printProductsAndPromptForProductId(List<Product> products) {
        System.out.println("ID | Product Name | Quantity In Stock");
        System.out.println("===========================================");
        for (Product product: products) {
            System.out.println(product.getId() + " | " + product.getProductName() + " | " + product.getQuantityInStock());
        }
        System.out.print("\nEnter the product ID to modify: ");
        return scanner.nextInt();
    }
    public String inputProductSearch() {
        System.out.print("Enter a product name to search for: ");
        String productName = scanner.nextLine();
        return productName;
    }

    public static void main(String[] args) {
        ProductMain pm = new ProductMain();
        pm.run();
    }
}

// I Want to be able to search for a product and then change the quantity in stock to reflect current inventory levels.
// 1) I need to be able to prompt the user for which product to search for
// 2) I need to be able to show the products and allow the user to select a product to modify
// 3) I need to prompt the user to enter the new value quantity in stock
// 4) I need to set the new quantity in stock on the product and save it to the database
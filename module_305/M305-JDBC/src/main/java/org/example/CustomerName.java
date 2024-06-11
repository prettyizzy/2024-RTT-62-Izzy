package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Product;

import java.util.List;
import java.util.Scanner;

public class CustomerName {

    private CustomerDAO customerDAO = new CustomerDAO();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        String productName = inputProductSearch();                      // prompt the user to enter a product name
        List<Product> products = customerDAO.findLikeName(productName);  // use our customerDAO to run the query
        int productID = printProductsAndPromptForProductId(products);                   // #2 Print the list of products

        Customer selected = customerDAO.findByID(productID);
        System.out.println(selected);

        int customerId = promptCustomerId();
        System.out.println(customerId);
    }

    public int promptCustomerId () {
        System.out.println("Please enter the customer ID:  ");
        int customerId = scanner.nextInt();
        return customerId;
    }
    public int print(List<Product> products) {
        System.out.println("ID | Customer Name | Quantity In Stock");
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
}

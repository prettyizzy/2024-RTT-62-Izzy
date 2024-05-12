package practice_assignments.pa303_2_1;

public class Cafe {
    public static void main(String[] args) {
        // Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        final double SALES_TAX = 0.06;

        // Write a program where you create three variables that represent products at a cafe.
        // Assign prices to each product.
        double matchaLatte = 5.99;
        double flatWhite = 4.99;
        double americano = 3.99;

        // Create two more variables called subtotal and totalSale
        double subtotal = ((matchaLatte * 3) + (flatWhite * 4) + (americano * 2));
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Complete an “order” for three items of the first product,
        // four items of the second product, and two items of the third product.
        System.out.println("""
                |  ----  ORDER RECEIPT ----  |
                | MATCHA LATTE.....$5.99 x 3 |
                | FLAT WHITE.......$4.99 x 4 |
                | AMERICANO........$3.99 x 2 |
                -----------                  |""");
        System.out.println("| SUBTOTAL            " + subtotal + "  |");
        System.out.println("| SALES TAX           " + SALES_TAX + "   |");
        System.out.println("---------                    |");

        // Results formatted to two decimal places
        String formattedSale = String.format("%.2f", totalSale);
        System.out.println("| TOTAL SALE          " + formattedSale + "  |");

    }
}

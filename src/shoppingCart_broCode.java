import java.util.Scanner;

public class shoppingCart_broCode {
    public static void main(String[] args) {

        // Shopping Cart Program

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to hold item details
        String item;         // Name of the item
        double price;        // Price per item
        int quantity;        // How many items the user wants to buy
        char currency = 'R'; // Currency symbol (e.g., R for Rand)
        double total;        // Total cost (price × quantity)

        // Ask the user what item they want to buy
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();  // Read the full item name (including spaces)

        // Ask for the price of one item
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();  // Read the price as a decimal number

        // Ask how many the user wants
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();  // Read the quantity as an integer

        // Calculate the total cost
        total = price * quantity;

        // Display a summary of the purchase
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("The total is " + currency + total);

        // Close the scanner to free system resources
        scanner.close();
    }
}

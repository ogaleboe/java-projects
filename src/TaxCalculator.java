import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the price of the product: ");
        double price = scanner.nextDouble();

        double tax = price * 0.15;
        double totalAmount = price + tax;

        System.out.println("Original Price: R" + price);
        System.out.println("Tax (15%): R" + tax);
        System.out.println("Total Amount (Price + Tax): R" + totalAmount);

        scanner.close();
    }
}

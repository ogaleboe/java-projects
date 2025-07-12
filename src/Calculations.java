import javax.swing.*;

public class Calculations {
    public static void main(String [] args) {

        int quantity;
        double unitPrice, totalPrice, vatAmount, totalWithVAT;
        quantity = 3;
        unitPrice = 4.5;
        totalPrice = unitPrice * quantity;

        // VAT rate is 14%
        vatAmount = totalPrice * 0.14;
        totalWithVAT = totalPrice + vatAmount;


        JOptionPane.showMessageDialog(null, "The total price including VAT is: R " + String.format("%.2f", totalWithVAT));
    }
}

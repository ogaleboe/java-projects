import javax.swing.JOptionPane; // Import JOptionPane for pop-ups

public class PopupCalculator {
    public static void main(String[] args) {
        // Get first number as a String, then convert it to a double
        String firstNumber = JOptionPane.showInputDialog("Enter first number:");
        double num1 = Double.parseDouble(firstNumber);

        // Get second number as a String, then convert it to a double
        String secondNumber = JOptionPane.showInputDialog("Enter second number:");
        double num2 = Double.parseDouble(secondNumber);

        // Perform addition
        double sum = num1 + num2;

        // Display the result in a pop-up message box
        JOptionPane.showMessageDialog(null, "The sum is: " + sum);

        System.exit(0); // Close the program properly
    }
}


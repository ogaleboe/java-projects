import javax.swing.*;

public class InputsOutput {
    public static void main(String[] args) {
        int num1;
        int num2;
        int total;
        String numString1;
        String numString2;

        numString1 = JOptionPane.showInputDialog("Enter a number");
         numString2 = JOptionPane.showInputDialog("Enter a number");

         num1 = Integer.parseInt(numString1);
        num2 = Integer.parseInt(numString2);

        total = num1 + num2;

        JOptionPane.showMessageDialog(null, "The total is " + total);
    }
}

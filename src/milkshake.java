import javax.swing.JOptionPane;

public class milkshake {
    public static void main (String [] args) {
        String str = JOptionPane.showInputDialog("Enter the size of the milkshake you would like to purchase: " + "\n" + "1: Small " + "\n" + "2: Medium" + "\n" + "3: Large ");
        int choice = Integer.parseInt(str);

        if (choice == 1) {
            System.out.println("The price for a small milkshake = R5");
        } else if (choice == 2) {
            System.out.println("The price for a medium = R10");
        } else if (choice == 3) {
            System.out.println("The price for large = R15");
        } else {
            System.out.println("Invalid choice");
        }
    }
}

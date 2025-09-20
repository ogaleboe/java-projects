import javax.swing.JOptionPane;

public class Names {
    public static void main (String [] args) {
        String str = JOptionPane.showInputDialog("Entre a Name: ");

        if (str.equals("Benji")) {
            System.out.println("Correct name is entered ");
        } else {
                System.out.println("Incorrect name entered");
        }
    }
}

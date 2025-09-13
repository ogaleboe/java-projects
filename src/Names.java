import javax.swing.JOptionPane;

public class Names {
<<<<<<< HEAD
    public static void main () {
=======
    public static void main (String [] args) {
>>>>>>> 10944327afb83011dec3e8ed7d6ae171072e4449
        String str = JOptionPane.showInputDialog("Entre a Name: ");

        if (str.equals("Benji")) {
            System.out.println("Correct name is entered ");
        } else {
                System.out.println("Incorrect name entered");
        }
    }
}

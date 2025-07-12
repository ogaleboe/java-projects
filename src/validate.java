import javax.swing.JOptionPane;

public class validate {
    public static  void main (String [] args) {
        String username = JOptionPane.showInputDialog("Enter username: ");
        String password = JOptionPane.showInputDialog("Enter password: ");

        if ((username.equals("tron")) && (password.equals ("abc123"))) {
            JOptionPane.showMessageDialog(null, "Access granted");
        } else {
            System.out.println("Invalid user and/or password entered");
        }
    }
}
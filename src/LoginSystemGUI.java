import javax.swing.JOptionPane;
import java.util.HashMap;

public class LoginSystemGUI {
    public static void main(String[] args) {
        // Step 1: Store usernames and passwords
        HashMap<String, String> users = new HashMap<>();
        users.put("tron", "abc124");
        users.put("admin", "admin123");
        users.put("alice", "pass456");

        // Step 2: Get login input
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        // Step 3: Validate login
        if (users.containsKey(username) && users.get(username).equals(password)) {
            JOptionPane.showMessageDialog(null, "Access granted. Welcome, " + username + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Access denied. Invalid username or password.");
        }
    }
}

import javax.swing.JOptionPane;

public class SimpleMethod
{
    // Method 1: Show hello message
    public static void showmessage()
    {
        JOptionPane.showMessageDialog(null,"Hello everyone");
    }

    // Method 2: Show goodbye message
    public static void showGoodbyeMessage()
    {
        JOptionPane.showMessageDialog(null, "Goodbye everyone");
    }

    // Main method - entry point of the program
    public static void main(String [] args)
    {
        showmessage();           // Call method to show hello message
        showGoodbyeMessage();    // Call method to show goodbye message
    }
}

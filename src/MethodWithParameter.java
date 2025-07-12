import javax.swing.JOptionPane;

public class MethodWithParameter
{
    public static void showMessage(String msg)
    {
        JOptionPane.showMessageDialog(null, msg);
    }

    public static void main(String [] args)
{
    showMessage("Its a nice day");
}
}


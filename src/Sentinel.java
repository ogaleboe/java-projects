import javax.swing.JOptionPane;

public class Sentinel {
    public static void main (String [] args) {
        String name;
        name = JOptionPane.showInputDialog("Enter a name: ");
        while (!name.equals("Apple")){
            name = JOptionPane.showInputDialog("Enter another name: ");
        }
        System.out.println("Name is correct");
    }
}

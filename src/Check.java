import javax.swing.JOptionPane;

public class Check {
    public static void main (String [] args) {
        int age;
        String str = JOptionPane.showInputDialog("Enter age ");
        age = Integer.parseInt(str);

        if ((age < 12) || (age > 60)) {
            System.out.println("Discount granted!");
            System.out.println("You are < 12");
        } else {
        System.out.println("No discount!!");
    }
}
}

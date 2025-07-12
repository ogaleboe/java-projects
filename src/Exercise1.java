import javax.swing.JOptionPane;
public class Exercise1 {
    public static void main (String [] args ) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 1;

        JOptionPane.showMessageDialog(null, num1 + "\n" + num2 + "\n" + num3);
        int temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;
        System.out.println(num1 + "\n" + num2 + "/n" + num3);
        JOptionPane.showMessageDialog(null, num1 + num2 + num3);
        JOptionPane.showMessageDialog(null,"num1 + num2 + num3 ");
    }
}

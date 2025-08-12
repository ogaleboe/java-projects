import javax.swing.JOptionPane;

public class arrayAge {
    public static void main (String [] args){

        int sum =0;
        int [] ages = new int[5];

        for (int i = 0; i <5; i++){
            String str = JOptionPane.showInputDialog("Enter age: ");
            ages[i] = Integer.parseInt(str);
            sum = sum + ages[i];
        }
        double avg = sum/5;
        System.out.println("The average age = " + avg);
    }
}

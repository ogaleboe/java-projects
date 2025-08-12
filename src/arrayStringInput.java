import javax.swing.*;

public class arrayStringInput {
    public static void main (String [] args){

        String [] Names = new String[5];
        int i;
        for(i =0; i <=4; i++){
            Names[i] = JOptionPane.showInputDialog("Enter your name: ");
        }
        for(i=0; i<=4; i++){
            System.out.println("Your nameis: " + Names[i]);
        }
    }
}

import javax.swing.JOptionPane; // Import JOptionPane for GUI input dialogs

public class arraysInput {
    public static void main (String [] args) {

        // Declare an integer array 'marks' that can store 5 integers.
        // Arrays are objects in Java, so we use 'new' to create it.
        int[] marks = new int[10];

        // Declare a loop counter variable 'i' for use in the for loops
        int i;

        // ---------------- FIRST LOOP ----------------
        // Purpose: Get 5 marks from the user via JOptionPane
        for (i = 0; i <= 9; i++) { // Start i at 0, loop until i is 4 (inclusive)

            // Show an input dialog asking for a student's mark
            // The result from JOptionPane is always a String
            String str = JOptionPane.showInputDialog("Enter a mark for the students: ");

            // Convert the String input to an integer, store in marks[i]
            marks[i] = Integer.parseInt(str);
        }

        // ---------------- SECOND LOOP ----------------
        // Purpose: Display all 5 marks entered by the user
        for (i = 0; i <= 4 ; i++) { // Loop through indexes 0 to 4
            // Print each mark stored in the 'marks' array
            System.out.println("Mark: " + marks[i]);
        }
    }
}

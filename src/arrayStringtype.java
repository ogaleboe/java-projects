public class arrayStringtype {
    public static void main (String [] args){

        // Declare and initialize an array of Strings called StudentNames
        // This array stores the names of 10 students.
        String [] StudentNames = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9" ,"name10"};

        //System.out.println(names[1]);

        // Example of printing a single name from the array using its index:
        // System.out.println(StudentNames[1]);  // would print "name2"

        for( int i = 0; i < StudentNames.length; i++) {
            // Print the name at index i
            System.out.println(StudentNames[i]);
        }
    }
}

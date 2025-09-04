public class DoWhileLoop {
    public static void main (String [] args){

        int i = 0;

        // A do-while loop always executes the block at least once
        do
        {
            System.out.println("Hi " + i);
            ++i;
        } while (i <= 5);
    }
}

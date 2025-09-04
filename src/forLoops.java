public class forLoops {
    public static void main(String[] args) {

        //When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
        //Statement 1 is executed (one time) before the execution of the code block.
        //Statement 2 defines the condition for executing the code block.
        //Statement 3 is executed (every time) after the code block has been executed.

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("count: " + i);
        }
    }
}


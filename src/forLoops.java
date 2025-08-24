public class forLoops {
    public static void main(String[] args) {

        //Used when you know in advance how many times to repeat.

        /*for (int a = 0; a <= 4; a++)
    System.out.println("count: " + a); */

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}


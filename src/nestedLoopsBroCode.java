import java.util.Scanner;

public class nestedLoopsBroCode {
    public static void main(String[] args) {

        // Nested loop = a loop inside another loop
        //                 Used often with matrices or DS&A

         /*for(int i = 1; i <= 5; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            }
          */

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of Rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of Columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i++) {
             for(int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}

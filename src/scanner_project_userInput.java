import java.util.Scanner;

public class scanner_project_userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.printf("Hello " + name +"." +" "+ age + " is an excellent age to start programming lol.");
        scanner.close();
    }
}
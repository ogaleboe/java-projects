import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.printf("Hello " + name +"." +" "+ age + " is an excellent age to start programming lol.");
        scanner.close();
    }
}
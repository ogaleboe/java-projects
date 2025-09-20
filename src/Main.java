public class Main {
    public static void main(String[] args) {
        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory(stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference (Non-primitive data types)
        // ---------    ---------
        // int          string
        //double        array
        //char          object
        //boolean

        // 2 Steps to creating a variable

        // 1. declaration
        //2. assignment

        int age = 30;
        int year = 2025;
        int quantity = 1;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = 12.5;

        char grade = 'A';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean online = true;

        /*if(isStudent){
            System.out.println("You are a student");
        } else{
            System.out.println("You are Not a student");
        } */

        String name = "Ofentse";

        System.out.println("Hi " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("--------------");
        System.out.println("A - pass B - fail");
        System.out.println("Your results for all your modules is " + grade + " .Well done!");
        System.out.println("You will receive " + currency + "10 000 dollars");
        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are Not a student");
        }
    }
}
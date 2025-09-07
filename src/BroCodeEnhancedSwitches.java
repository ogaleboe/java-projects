import java.util.Scanner;

public class BroCodeEnhancedSwitches {
    public static void main (String [] args){

        //Enhanced switch = A replacement to many else if statments
        //                  (Java 14 feature)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday");
            case "Sat","Sun" -> System.out.println("It is a weekend");
            default -> System.out.println( day + " is not a day");
        }
    }
}

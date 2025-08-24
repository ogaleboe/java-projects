public class ifStatement {
    public static void main(String[] args) {

        /*
        int time = 20;

        if (time <= 12) {
            System.out.println("Good morning!");
        } else if (time <= 17) {
            System.out.println("Good afternoon!");
        } else if(time >=18) {
            System.out.println("Good evening!");
        } */

        int age = 25;

        if (age <= 18) {
            System.out.println("You are a child");
        } else if (age <= 65) {
            System.out.println("You are an adult");
        } else if (age >=65)
            System.out.println("You are a senior");
    }
}

public class UseCat {
    public static void main(String[]args){
        Cat c1 = new Cat();

        c1.name = "Tixe";
        c1.colour = "Ginger";
        c1.age = 2;
        c1.height = 25;
        c1.weight = 2;

        System.out.println(c1.name + " is " + c1.age + " years old Cat");
        c1.eat();
        c1.walk();
    }
}

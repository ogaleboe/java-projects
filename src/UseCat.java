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
        c1.meow();

        Cat C2 = new Cat("Spark", 3);
        System.out.println(C2.name + " " + C2.age);
        C2.walk();

        Cat C3 = new Cat("Black",5,7);
        System.out.println(C3.colour + " " + C3.height + " " + C3.weight);
        C3.sleep();

        Cat C4 = new Cat();
        C4.name = "Cat 4";
        C4.age = 11;
        System.out.println(C4.name + " "+ C4.age);
    }
}

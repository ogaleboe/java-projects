public class Cat {

    public String name;
    public String colour;
    public int age;
    public int height;
    public int weight;

    //implicit constructor
    public Cat (){
    }

    public Cat (String name, int age){ //overloaded constructor
        this.name = name;
        this.age = age;
    }

    public Cat (String colour, int height, int weight){ //overloaded constructor
        this.colour = colour;
        this.height = height;
        this.weight = weight;
    }


    public void eat(){
        System.out.println("Cat eating");
    }
    public void sleep(){
        System.out.println("Cat sleeping");
    }
    public void meow(){
        System.out.println("Meow");
    }
    public void walk(){
        System.out.println("Cat walking");
    }
}

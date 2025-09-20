public class Person {

    public String name;
    public String surname;
    public int age;

    //this is the default or no args constructor
    public Person(){

    }

    public Person (String n){
        this.name = n;
    }

    public Person(String n, String s, int a){
        this.name = n;
        this.surname = s;
        this.age = a;
    }
}

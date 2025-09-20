public class OverloadedMethodBroCode {
    public static void main(String[] args) {

        //Overloaded Methods = methods that share the same name, but different parameters
        //                      signature = name + parameters

        System.out.println(add(1, 2, 3));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }
}

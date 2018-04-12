package overload;

public class Calculator {
    // return type of methods doesn't matter when overloading a method
    // More than one method with same name and argument list cannot be defined in a same class.

    public void add(int a, int b){
        System.out.println("a + b = " + (a + b));
    }

    public void add(int a, int b, int c){
        System.out.println("a + b + c = " + (a + b + c));
    }

    public  void add(float a, float b){
        System.out.println("a + b = " + (a + b));
    }
}

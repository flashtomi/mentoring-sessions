package inheritance;

//The inherited fields can be used directly, just like any other fields.
//You can declare a field in the subclass with the same name as the one in the superclass, thus hiding it (not recommended).
//You can declare new fields in the subclass that are not in the superclass.
//The inherited methods can be used directly as they are.
//You can write a new instance method in the subclass that has the same signature as the one in the superclass, thus overriding it.
//You can write a new static method in the subclass that has the same signature as the one in the superclass, thus hiding it.
//You can declare new methods in the subclass that are not in the superclass.
//You can write a subclass constructor that invokes the constructor of the superclass, either implicitly or by using the keyword super.

public class Calculator {
    int z;
    int num = 99;
    private int value;
    int superValue = 999;
    protected String protectedValue = "protected string";

    public void summ(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: " + z);
    }

    public void sub(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: " + z);
    }

    public void print() {
        System.out.println("Super class print method");
    }

    final void testFinalPrint() {
        System.out.println("Subclass can call the final method but cannot override it");
    }

    public static void testStatic() {
        System.out.println("Static method of the superclass. Subclass inherit the static method of the superclass");
    }

    protected void testProtected() {
        System.out.println("Protected method inherited by the subclass.");
    }

    private void testPrivate() {
        System.out.println("");
    }

    public Calculator() {}

    public Calculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

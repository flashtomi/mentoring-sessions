package inheritance;

public class Calculator {
    int z;
    int num = 99;
    private int value;
    int superValue = 999;

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
        System.out.println("Protected class inherited by the subclass.");
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

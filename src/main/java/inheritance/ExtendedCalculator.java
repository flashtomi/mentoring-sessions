package inheritance;

public class ExtendedCalculator extends Calculator {
    int num = 66;
    int superValue = 999; // Within a class, a field that has the same name as a field in the superclass hides the superclass's field, even if their types are different.
    protected int protectedValue = 999999; // field in the subclass with the same name as the one in the superclass hides it
    private String subclassOwnField;
    private int thirdArgument;

    public void multip(int x, int y) {
        z = x * y;
        System.out.println("The multiplication of the given numbers: " + z);
    }

    public void div(int x, int y) {
        z = x / y;
        System.out.println("The division of the given numbers: " + z);
    }

    @Override
    public void print() {
        System.out.println("Sub class print method");
    }

    public static void testStatic() {
        System.out.println("Subclass hide the same method of the superclass");
    }

    public ExtendedCalculator(int value) {
        super(value); //call the superclass constructor
    }

    public ExtendedCalculator(int value, String subclassOwnField) {
        super(value);
        this.subclassOwnField = subclassOwnField;
    }

    public ExtendedCalculator(int value, String subclassOwnField, int thirdArgument) {
        this(value,subclassOwnField);
        this.thirdArgument = thirdArgument;
    }

    @Override
    protected void testProtected() {
        System.out.println("Protected method inherited by the subclass. And sub can override it.");
    }

    public void display() {
        ExtendedCalculator calculator = new ExtendedCalculator(10);

        calculator.print();
        super.print();  // call super class print method
        System.out.println("Super class num value: " + super.num);
        System.out.println("Super class num value: " + calculator.num);
        System.out.println(calculator.getValue());
    }
}

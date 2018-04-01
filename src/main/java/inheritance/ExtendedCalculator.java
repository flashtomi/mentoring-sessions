package inheritance;

public class ExtendedCalculator extends Calculator {
    int num = 66;

    public void multip(int x, int y) {
        z = x * y;
        System.out.println("The multiplication of the given numbers: " + z);
    }

    public void div(int x, int y) {
        z = x / y;
        System.out.println("The division of the given numbers: " + z);
    }

    public void print() {
        System.out.println("Sub class print method");
    }

    public ExtendedCalculator(int value) {
        super(value);
    }

    public void display() {
        ExtendedCalculator calculator = new ExtendedCalculator(10);

        calculator.print();
        super.print();
        System.out.println("Super class num value: " + super.num);
        System.out.println("Super class num value: " + calculator.num);
        System.out.println(calculator.getValue());
    }
}

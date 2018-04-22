package inheritance;

public class App {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        ExtendedCalculator calculator = new ExtendedCalculator(100);
        calculator.sub(a,b);
        calculator.summ(a,b);
        calculator.div(a,b);
        calculator.multip(a,b);
        calculator.display();
        calculator.testFinalPrint();

        System.out.println(calculator.superValue);
        System.out.println(calculator.getValue());
    }
}

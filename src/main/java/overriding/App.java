package overriding;

import inheritance.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator subCalculator = new OverriddenCalculator();
        OverriddenCalculator subOverriddenCalculator = new OverriddenCalculator();

        calculator.print();
        subCalculator.print();
        subOverriddenCalculator.display();
    }
}

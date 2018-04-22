package overriding;

import inheritance.Calculator;

public class OverriddenCalculator extends Calculator {

    @Override
    public void print() {
        System.out.println("Overridden method of the super class print method");
    }

    public void display() {
        System.out.println("display method of the OverriddenCalculator.class");
    }

    public void superPrint() {
        super.print();
    }
}

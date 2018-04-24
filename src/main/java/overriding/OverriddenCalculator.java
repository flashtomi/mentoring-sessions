package overriding;

import inheritance.Calculator;

public class OverriddenCalculator extends Calculator {

    // a method in a subclass can return an object whose type is a subclass of the type returned by the method with the same signature in the superclass.

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

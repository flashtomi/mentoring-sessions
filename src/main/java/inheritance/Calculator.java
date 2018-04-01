package inheritance;

public class Calculator {
    int z;
    int num = 99;
    int value;

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

    public Calculator() {}

    public Calculator(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

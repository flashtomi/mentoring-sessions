package overload;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(2,4);
        calculator.add(2,4, 4);
        calculator.add(2f,4f);
    }
}

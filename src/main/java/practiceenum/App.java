package practiceenum;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        
        System.out.println(Alphabet.sumValues());

        int sum = Arrays.stream(Alphabet.values()).mapToInt(Alphabet::getValue).sum();
        System.out.println(sum);
    }
}

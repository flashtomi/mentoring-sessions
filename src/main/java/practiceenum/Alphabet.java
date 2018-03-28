package practiceenum;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum Alphabet implements AlphabetCalculator {
    A (1),
    B (2),
    C (3);

    private final int value;

    Alphabet(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int sumValues() {
        int sum = 0;
        for(Alphabet letter:Alphabet.values()){
            sum += letter.getValue();
        }
        return sum;
    }

    public int sumWithIterator(){
        Set<Alphabet> alphabetSet = EnumSet.allOf(Alphabet.class);
        Iterator<Alphabet> alphabetIterator = alphabetSet.iterator();
        int total = 0;
        while (alphabetIterator.hasNext()){
            total += alphabetIterator.next().value;
        }
        return total;
    }
}

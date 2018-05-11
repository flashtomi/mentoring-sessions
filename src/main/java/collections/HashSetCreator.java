package collections;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {

    public void createBookHashSet(List<Book> list) {

        HashSet<Book> bookSet = new HashSet<>(list);

        System.out.println("\nAfter adding all element to the HashSet");
        CollectionsHelper.printBooks(bookSet);
    }

    public void createNameHashSet(List<String> list) {

        HashSet<String> nameSet = new HashSet<>(list);

        System.out.println("\nAfter adding all element to the HashSet");
        CollectionsHelper.printNames(nameSet);
    }
}

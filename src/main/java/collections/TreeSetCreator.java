package collections;

import java.util.List;
import java.util.TreeSet;

public class TreeSetCreator {

    public void createBookTreeSet(List<Book> list) {

        TreeSet<Book> bookSet = new TreeSet<>(list);

        System.out.println("\nAfter adding all element to the TreeSet");

        CollectionsHelper.printBooks(bookSet);
    }

    public void createNameTreeSet(List<String> list) {

        TreeSet<String> nameSet = new TreeSet<>(list);

        System.out.println("\nAfter adding all element to the TreeSet");

        CollectionsHelper.printNames(nameSet);
    }
}

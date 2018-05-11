package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    // can contain duplicate elements
    // maintain insertion order
    // allow random access because array works at index basis
    // slow manipulation

    public void createBookArrayList(List<Book> list) {

        ArrayList<Book> bookList = new ArrayList<>(list);

        System.out.println("\nAfter adding all element to the ArrayList");

        CollectionsHelper.printBooks(bookList);
    }

    public void createNameArrayList(List<String> list) {

        ArrayList<String> nameList = new ArrayList<>(list);

        System.out.println("\nAfter adding all element to the ArrayList");

        CollectionsHelper.printNames(nameList);
    }
}

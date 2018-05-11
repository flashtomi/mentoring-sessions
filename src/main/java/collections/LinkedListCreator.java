package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {

    public void createBookLinkedList(List<Book> list) {

        LinkedList<Book> bookList = new LinkedList<>(list);

        System.out.println("\nAfter adding all element to the LinkedList");

        CollectionsHelper.printBooks(bookList);
    }

    public void createNameLinkedList(List<String> list) {

        LinkedList<String> nameList = new LinkedList<>(list);

        System.out.println("\nAfter adding all element to the LinkedList");

        CollectionsHelper.printNames(nameList);
    }
}

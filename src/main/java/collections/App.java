package collections;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();

        //Creating Books
        Book b1 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book b2 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        Book b4 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);

        //Adding Books to list
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Ravi");
        nameList.add("Vijay");
        nameList.add("Ravi");
        nameList.add("Ajay");

        ArrayListCreator arrayListCreator = new ArrayListCreator();
        arrayListCreator.createBookArrayList(bookList);
        arrayListCreator.createNameArrayList(nameList);

        LinkedListCreator linkedListCreator = new LinkedListCreator();
        linkedListCreator.createBookLinkedList(bookList);
        linkedListCreator.createNameLinkedList(nameList);

        HashSetCreator hashSetCreator = new HashSetCreator();
        hashSetCreator.createBookHashSet(bookList);
        hashSetCreator.createNameHashSet(nameList);

        TreeSetCreator treeSetCreator = new TreeSetCreator();
        treeSetCreator.createBookTreeSet(bookList);
        treeSetCreator.createNameTreeSet(nameList);

        QueueCreator queueCreator = new QueueCreator();
        queueCreator.createBookQueue(bookList);
        queueCreator.createNameQueue(nameList);
    }
}

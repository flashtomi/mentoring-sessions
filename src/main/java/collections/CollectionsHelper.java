package collections;

public class CollectionsHelper {

    public static void printBooks(Iterable<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }

    public static void printNames(Iterable<String> nameList) {
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}

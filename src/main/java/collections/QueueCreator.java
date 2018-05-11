package collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCreator {

    public void createBookQueue(List<Book> list) {

        Queue<Book> bookQueue = new PriorityQueue<>(list);

        System.out.println("\nAfter adding all element to the Queue");
        CollectionsHelper.printBooks(bookQueue);
    }

    public Queue<String> createNameQueue(List<String> list) {

        Queue<String> nameQueue = new PriorityQueue<>(list);

        System.out.println("\nAfter adding all element to the Queue");
        CollectionsHelper.printNames(nameQueue);

        return nameQueue;
    }

    public void removeFromQueue(Queue<?> queue, int quantity) {
        int x = 0;

        while(x < quantity) {
            queue.remove();
        }
    }
}

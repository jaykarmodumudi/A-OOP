package PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
        // Testing with Integer data type
        System.out.println("Priority Queue for Integers:");
        GenericPriorityQueue<Integer> intQueue = new GenericPriorityQueue<>();
        intQueue.enqueue(50);
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        intQueue.enqueue(40);

        System.out.println("Top element (Peek): " + intQueue.peek());
        System.out.println("Dequeuing: " + intQueue.dequeue());
        System.out.println("Top element (Peek): " + intQueue.peek());

        // Testing with String data type
        System.out.println("\nPriority Queue for Strings:");
        GenericPriorityQueue<String> strQueue = new GenericPriorityQueue<>();
        strQueue.enqueue("Banana");
        strQueue.enqueue("Apple");
        strQueue.enqueue("Cherry");
        strQueue.enqueue("Date");

        System.out.println("Top element (Peek): " + strQueue.peek());
        System.out.println("Dequeuing: " + strQueue.dequeue());
        System.out.println("Top element (Peek): " + strQueue.peek());

        // Testing with Double data type
        System.out.println("\nPriority Queue for Doubles:");
        GenericPriorityQueue<Double> doubleQueue = new GenericPriorityQueue<>();
        doubleQueue.enqueue(5.5);
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(3.3);
        doubleQueue.enqueue(2.2);

        System.out.println("Top element (Peek): " + doubleQueue.peek());
        System.out.println("Dequeuing: " + doubleQueue.dequeue());
        System.out.println("Top element (Peek): " + doubleQueue.peek());
    }
}

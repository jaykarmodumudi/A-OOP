package PriorityQueue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericPriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> heap;

    public GenericPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void enqueue(T element) {
        heap.add(element);
        heapifyUp(heap.size() - 1);
    }

    public T dequeue() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }

        T root = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);
        heapifyDown(0);
        return root;
    }

    public T peek() {
        if (heap.isEmpty()) {
            throw new NoSuchElementException("Priority queue is empty");
        }
        return heap.get(0); 
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        if (index > 0 && heap.get(index).compareTo(heap.get(parentIndex)) < 0) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestIndex = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallestIndex)) < 0) {
            smallestIndex = leftChildIndex;
        }

        if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallestIndex)) < 0) {
            smallestIndex = rightChildIndex;
        }

        if (smallestIndex != index) {
            swap(index, smallestIndex);
            heapifyDown(smallestIndex);
        }
    }

    private void swap(int index1, int index2) {
        T temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }
}
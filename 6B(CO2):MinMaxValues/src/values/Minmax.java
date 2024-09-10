package values;

interface MinMax<T extends Comparable<T>> {
    T findMin(T[] array); // Method to find minimum value
    T findMax(T[] array); // Method to find maximum value
}
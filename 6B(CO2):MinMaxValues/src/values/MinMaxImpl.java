package values;

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {

    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            return null; // Return null if array is empty or null
        }
        T min = array[0]; // Initialize min as first element
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element; // Update min if a smaller element is found
            }
        }
        return min;
    }

    @Override
    public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null; // Return null if array is empty or null
        }
        T max = array[0]; // Initialize max as first element
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element; // Update max if a larger element is found
            }
        }
        return max;
    }
}
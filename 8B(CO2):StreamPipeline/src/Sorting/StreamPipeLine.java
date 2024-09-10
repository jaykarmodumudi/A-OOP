package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeLine{
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Stream pipeline to filter, double, and collect even numbers
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 == 0)    // Filter even numbers
                                      .map(n -> n * 2)            // Double the numbers
                                      .collect(Collectors.toList()); // Collect into a list

        // Output the result
        System.out.println("Filtered and doubled even numbers: " + result);
    }
}

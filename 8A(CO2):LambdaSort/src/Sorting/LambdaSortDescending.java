package Sorting;

import java.util.Arrays;
import java.util.List;

public class LambdaSortDescending {
    public static void main(String[] args) {
    	
        List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Grapes", "Pineapple");

        strings.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Sorted list in descending order: " + strings);
    }
}
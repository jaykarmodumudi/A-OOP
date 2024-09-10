package values;

public class GenericMinMax {
    public static void main(String[] args) {
        // Arrays of different data types
        Integer[] intArray = {10, 20, 30, 5, 50};
        String[] strArray = {"Apple", "Orange", "Banana", "Pineapple"};
        Character[] charArray = {'a', 'z', 'e', 'b', 'x'};
        Float[] floatArray = {10.5f, 50.5f, 1.2f, 100.3f, 25.6f};
        
        // Creating instances of the generic class for each data type
        MinMaxImpl<Integer> intMinMax = new MinMaxImpl<>();
        MinMaxImpl<String> strMinMax = new MinMaxImpl<>();
        MinMaxImpl<Character> charMinMax = new MinMaxImpl<>();
        MinMaxImpl<Float> floatMinMax = new MinMaxImpl<>();
        
        // Finding and displaying min and max for each array
        System.out.println("Integer Array: ");
        System.out.println("Min: " + intMinMax.findMin(intArray));
        System.out.println("Max: " + intMinMax.findMax(intArray));
        
        System.out.println("\nString Array: ");
        System.out.println("Min: " + strMinMax.findMin(strArray));
        System.out.println("Max: " + strMinMax.findMax(strArray));
        
        System.out.println("\nCharacter Array: ");
        System.out.println("Min: " + charMinMax.findMin(charArray));
        System.out.println("Max: " + charMinMax.findMax(charArray));
        
        System.out.println("\nFloat Array: ");
        System.out.println("Min: " + floatMinMax.findMin(floatArray));
        System.out.println("Max: " + floatMinMax.findMax(floatArray));
    }
}
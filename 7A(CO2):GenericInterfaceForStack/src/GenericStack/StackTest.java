package GenericStack;

public class StackTest {
    public static void main(String[] args) {
    	
        System.out.println("Testing Array-based Stack with Integer:");
        ArrayStack<Integer> arrayStack = new ArrayStack<>(5);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        System.out.println("Top element: " + arrayStack.peek());
        System.out.println("Popped: " + arrayStack.pop());
        System.out.println("Top element after pop: " + arrayStack.peek());

        // Testing LinkedList-based Stack with String
        System.out.println("\nTesting LinkedList-based Stack with String:");
        LinkedListStack<String> linkedListStack = new LinkedListStack<>();
        linkedListStack.push("Apple");
        linkedListStack.push("Banana");
        linkedListStack.push("Cherry");
        System.out.println("Top element: " + linkedListStack.peek());
        System.out.println("Popped: " + linkedListStack.pop());
        System.out.println("Top element after pop: " + linkedListStack.peek());

        // Testing Array-based Stack with Float
        System.out.println("\nTesting Array-based Stack with Float:");
        ArrayStack<Float> floatArrayStack = new ArrayStack<>(5);
        floatArrayStack.push(1.1f);
        floatArrayStack.push(2.2f);
        floatArrayStack.push(3.3f);
        System.out.println("Top element: " + floatArrayStack.peek());
        System.out.println("Popped: " + floatArrayStack.pop());
        System.out.println("Top element after pop: " + floatArrayStack.peek());
    }
}

package GenericStack;

class ArrayStack<T> implements GenericStack<T> {
 private T[] stack;
 private int top;
 private int capacity;

 public ArrayStack(int size) {
     stack = (T[]) new Object[size];
     capacity = size;
     top = -1;
 }

 @Override
 public void push(T element) {
     if (top == capacity - 1) {
         System.out.println("Stack overflow. Cannot push " + element);
         return;
     }
     stack[++top] = element;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         System.out.println("Stack underflow. Cannot pop.");
         return null;
     }
     return stack[top--];
 }

 @Override
 public T peek() {
     if (!isEmpty()) {
         return stack[top];
     }
     System.out.println("Stack is empty.");
     return null;
 }

 @Override
 public boolean isEmpty() {
     return top == -1;
 }
}

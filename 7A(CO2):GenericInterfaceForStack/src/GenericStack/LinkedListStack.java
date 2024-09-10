package GenericStack;

class LinkedListStack<T> implements GenericStack<T> {
 private Node<T> top;

 public LinkedListStack() {
     top = null;
 }

 @Override
 public void push(T element) {
     Node<T> newNode = new Node<>(element);
     newNode.next = top;
     top = newNode;
 }

 @Override
 public T pop() {
     if (isEmpty()) {
         System.out.println("Stack underflow. Cannot pop.");
         return null;
     }
     T data = top.data;
     top = top.next;
     return data;
 }

 @Override
 public T peek() {
     if (!isEmpty()) {
         return top.data;
     }
     System.out.println("Stack is empty.");
     return null;
 }

 @Override
 public boolean isEmpty() {
     return top == null;
 }
}

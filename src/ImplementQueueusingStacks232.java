import java.util.Stack;

public class ImplementQueueusingStacks232 {
    class MyQueue {

        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();

        // Push element x to the back of queue.
        public void push(int x) {
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
            stack1.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            stack2.pop();
        }

        // Get the front element.
        public int peek() {
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
            return stack2.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}

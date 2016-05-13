import java.util.Stack;

public class ImplementQueueusingStacks232 {
    class MyQueue {
        Stack<Integer> stack1;
        Stack<Integer> stack2;

        // Push element x to the back of queue.
        public void push(int x) {
            stack1.push(x);
        }

        // Removes the element from in front of queue.
        public void pop() {
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            } else stack2.pop();
        }

        // Get the front element.
        public int peek() {
            if (stack2.empty()) {
                while (!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
                return stack2.peek();
            } else return stack2.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }
}

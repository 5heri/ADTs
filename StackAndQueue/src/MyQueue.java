
/*
 * Creating a queue(FIFO) out of 2 stacks(LIFO)
 */
public class MyQueue<T> {
	
	private Stack<T> firstStack;
	private Stack<T> secondStack;
	
	public MyQueue(int capacity) {
		firstStack = new Stack<T>(capacity);
		secondStack = new Stack<T>(capacity); 
	}
	
	public int size() {
		return firstStack.size() + secondStack.size();
	}
	
	public void push(T item) {
		firstStack.push(item);
	}
	
	public T pop() {
		shiftStacks();
		return secondStack.pop();
	}
	
	public T peek() {
		shiftStacks();
		return secondStack.peek();
	}
	
	private void shiftStacks() {
		if (secondStack.isEmpty()) {
			while (!firstStack.isEmpty()) {
				secondStack.push(firstStack.pop());
			}	
		}
	}
}

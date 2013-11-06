import java.util.ArrayList;


public class SetOfStacks<T> {
	ArrayList<Stack<T>> stacks = new ArrayList<Stack<T>>();
	
	public void push(T item) {
		Stack<T> firstStack = getFirstStack();
		
		if (firstStack != null && !firstStack.isFull()) {
			firstStack.push(item);
		} else {
			Stack<T> newStack = new Stack<T>(5);
			newStack.push(item);
			stacks.add(newStack);
			//System.out.println("Added to new stack");
		}
	}
	
	public T pop() {
		Stack<T> firstStack = getFirstStack();
		T item = firstStack.pop();
		
		if (firstStack.isEmpty()) {
			stacks.remove(stacks.size() - 1);
			//System.out.println("Removing last stack");
		}
		return item;
		
	}
	
	private Stack<T> getFirstStack() {
		if (stacks.size() == 0) {
			return null;
		} else {
			return stacks.get(stacks.size() - 1);
		}
	}
	
}
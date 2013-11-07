
public class StackSort<T> {
	
	private Stack<T> original;
	
	public StackSort(Stack<T> stack) {
		original = stack;
	}
	
	public Stack<T> sort() {
		Stack<T> sortedStack = new Stack<T>(original.size());
		
		while(!original.isEmpty()) {
			T insert = original.pop();
			if (sortedStack.isEmpty()) {
				sortedStack.push(insert);
			} else {
				if (((Integer) insert).compareTo(((Integer) sortedStack.peek())) > 0) {
					sortedStack.push(insert);
				} else {
					while (!sortedStack.isEmpty() 
							&& ((Integer) insert).compareTo(((Integer) sortedStack.peek())) < 0) {
						original.push(sortedStack.pop());
					}
					sortedStack.push(insert);
				}
			}
		}
		return sortedStack;
	}

}

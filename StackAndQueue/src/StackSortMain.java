
public class StackSortMain {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>(5);
		stack.push(2);
		stack.push(6);
		stack.push(9);
		stack.push(8);
		stack.push(3);

		
		StackSort<Integer> stackSort = new StackSort<Integer>(stack);
		
		stack = stackSort.sort();
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		
		
	}

}

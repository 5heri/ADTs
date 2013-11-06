
/*
 * Returns the minimum item in the stack. 
 */
public class MainForMin {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(7);
		stack.push(2);
		stack.push(-2);
		stack.push(4);
		
		System.out.println(stack.minItem());

	}

}

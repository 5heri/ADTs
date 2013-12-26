
/*
 * Returns the minimum item in the stack. 
 * 
 *  BUG: When item is poped, the min does not change to a new minimum.
 */
public class MainForMin {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(7);
		stack.push(2);
		stack.push(-2);
		stack.push(-4);
		
		System.out.println(stack.minItem());
		
		stack.pop();
		System.out.println(stack.minItem());

	}

}

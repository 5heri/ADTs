
public class SetOfStacksMain {

	public static void main(String[] args) {

		SetOfStacks<Integer> stacks = new SetOfStacks<Integer>();
		stacks.push(1);
		stacks.push(3);
		stacks.push(5);
		stacks.push(7);
		stacks.push(9);
		
		stacks.push(0);
		stacks.push(2);
		stacks.push(4);
		stacks.push(6);
		stacks.push(8);
		
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println("SWITCH STACK");
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
		System.out.println(stacks.pop());
	}
}

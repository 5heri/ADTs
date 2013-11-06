
public class MainForArrayStack {

	public static void main(String[] args) throws Exception {
		StacksWithArray arrayStack = new StacksWithArray();
		
		arrayStack.push(1, 1);
		arrayStack.push(1, 2);
		arrayStack.push(1, 3);
		arrayStack.push(1, 4);
		System.out.println(arrayStack.pop(1));
		System.out.println(arrayStack.pop(1));
		System.out.println(arrayStack.pop(1));
		System.out.println(arrayStack.pop(1));
		System.out.println();
		
		arrayStack.push(2, 1);
		arrayStack.push(2, 2);
		arrayStack.push(2, 3);
		arrayStack.push(2, 4);
		System.out.println(arrayStack.pop(2));
		System.out.println(arrayStack.pop(2));
		System.out.println(arrayStack.pop(2));
		System.out.println(arrayStack.pop(2));
		System.out.println();
		
		arrayStack.push(3, 1);
		arrayStack.push(3, 2);
		arrayStack.push(3, 3);
		arrayStack.push(3, 4);
		System.out.println(arrayStack.pop(3));
		System.out.println(arrayStack.pop(3));
		System.out.println(arrayStack.pop(3));
		System.out.println(arrayStack.pop(3));
	}

}


/*
 * Implementing 3 stack using one array.
 */
public class StacksWithArray {
	
	private static final int firstStack = 1;
	private static final int secondStack = 2;
	private static final int thirdStack = 3;
	private static final int limitForFirst = 99;
	private static final int limitForSecond = 199;
	private static final int limitForThird = 299;
	private static final int leastForFirst = 0;
	private static final int leastForSecond = 100;
	private static final int leastForThird = 200;
	
	private int sizeOfArray = 300;
	private int[] stackArray = new int[sizeOfArray];
	private int pointToFirst = -1;
	private int pointToSecond = 99;
	private int pointToThird = 199;
	
	public void push(int stackNumber, int value) throws Exception {
		if (stackNumber == firstStack) {
			if (pointToFirst > limitForFirst) {
				throw new Exception("First stack is full");
			} else {
				stackArray[pointToFirst + 1] = value;
				pointToFirst++;				
			}
		} else if (stackNumber == secondStack) {
			if (pointToSecond > limitForSecond) {
				throw new Exception("Second stack is full.");
			} else {
				stackArray[pointToSecond + 1] = value;
				pointToSecond++;				
			}
		} else if (stackNumber == thirdStack) {
			if (pointToThird > limitForThird) {
				throw new Exception("Third stack is full.");
			} else {
				stackArray[pointToThird + 1] = value;
				pointToThird++;				
			}
		} else {
			throw new Exception("Incorrect stack number");
		}
	}
	
	public int pop(int stackNumber) throws Exception {
		int item = 0;
		
		if (stackNumber == firstStack) {
			if (pointToFirst < leastForFirst) {
				throw new Exception("First stack is empty");
			} else {
				item = stackArray[pointToFirst];
				pointToFirst--;
			}

		} else if (stackNumber == secondStack) {
			if (pointToSecond < leastForSecond) {
				throw new Exception("Second stack is empty");
			} else {
				item = stackArray[pointToSecond];
				pointToSecond--;
			}

		} else if (stackNumber == thirdStack) {
			if (pointToThird < leastForThird) {
				throw new Exception("Third stack is empty");
			} else {
				item = stackArray[pointToThird];
				pointToThird--;
			}

		} else {
			throw new Exception("Incorrect stack number");
		}
		return item;
	}
	
	public int peek(int stackNumber) throws Exception {
		if (stackNumber == firstStack) {
			return stackArray[pointToFirst];
		} else if (stackNumber == secondStack) {
			return stackArray[pointToSecond];
		} else if (stackNumber == thirdStack) {
			return stackArray[pointToThird];
		} else {
			throw new Exception("Incorrect stack number");
		}
	}
}

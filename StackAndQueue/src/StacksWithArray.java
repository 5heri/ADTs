
/*
 * Implementing 3 stack using one array.
 */
public class StacksWithArray {
	
	private static final int FIRST_STACK = 1;
	private static final int SECOND_STACK = 2;
	private static final int THIRD_STACK = 3;
	private static final int LIM_FOR_FIRST = 99;
	private static final int LIM_FOR_SECOND = 199;
	private static final int LIM_FOR_THIRD = 299;
	private static final int LEAST_FOR_FIRST = 0;
	private static final int LEAST_FOR_SECOND = 100;
	private static final int LEAST_FOR_THIRD = 200;
	
	private int sizeOfArray = 300;
	private int[] stackArray = new int[sizeOfArray];
	private int pointToFirst = -1;
	private int pointToSecond = 99;
	private int pointToThird = 199;
	
	public void push(int stackNumber, int value) throws Exception {
		if (stackNumber == FIRST_STACK) {
			if (pointToFirst > LIM_FOR_FIRST) {
				throw new Exception("First stack is full");
			} else {
				stackArray[pointToFirst + 1] = value;
				pointToFirst++;				
			}
		} else if (stackNumber == SECOND_STACK) {
			if (pointToSecond > LIM_FOR_SECOND) {
				throw new Exception("Second stack is full.");
			} else {
				stackArray[pointToSecond + 1] = value;
				pointToSecond++;				
			}
		} else if (stackNumber == THIRD_STACK) {
			if (pointToThird > LIM_FOR_THIRD) {
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
		
		if (stackNumber == FIRST_STACK) {
			if (pointToFirst < LEAST_FOR_FIRST) {
				throw new Exception("First stack is empty");
			} else {
				item = stackArray[pointToFirst];
				pointToFirst--;
			}

		} else if (stackNumber == SECOND_STACK) {
			if (pointToSecond < LEAST_FOR_SECOND) {
				throw new Exception("Second stack is empty");
			} else {
				item = stackArray[pointToSecond];
				pointToSecond--;
			}

		} else if (stackNumber == THIRD_STACK) {
			if (pointToThird < LEAST_FOR_THIRD) {
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
		if (stackNumber == FIRST_STACK) {
			return stackArray[pointToFirst];
		} else if (stackNumber == SECOND_STACK) {
			return stackArray[pointToSecond];
		} else if (stackNumber == THIRD_STACK) {
			return stackArray[pointToThird];
		} else {
			throw new Exception("Incorrect stack number");
		}
	}
}

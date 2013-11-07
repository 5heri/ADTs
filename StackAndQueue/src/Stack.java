
public class Stack<T> {
	
	private Node<T> top;
	private T min;
	private int size;
	private int capacity;
	
	public Stack(int capacity) {
		this.capacity = capacity;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T pop() {
		if (top == null) {
			return null;
		} else {
			T item = top.getElem();
			top = top.getNext();
			size--;
			return item;
		}
	}
	
	public void push(T item) {
		if (min == null) {
			min = item;
		} else if (((Integer) item).compareTo((Integer) min) < 0) {
			min = item;
		}
		Node<T> newNode = new Node<T>(item); 
		newNode.setNext(top);
		top = newNode;
		size++;
	}
	
	public T peek() {
		if (top == null) {
			return null;
		} else {
			return top.getElem();			
		}
	}
	
	public T minItem() {
		return min;
	}

}

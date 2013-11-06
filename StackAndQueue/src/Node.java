
public class Node<T> {
	
	private T element;
	private Node<T> next;
	
	public Node(T element) {
		this.element = element;
		next = null;
	}

	public T getElem() {
		return element;
	}
	
	public void setElem(T newElem) {
		element = newElem;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> newNode) {
		next = newNode;
	}
	
	public void display() {
		System.out.print(element + " ");	
	}

}
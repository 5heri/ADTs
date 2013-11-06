
public class Queue<T> {
	
	private Node<T> first;
	private Node<T> last;
	
	public void enqueue(T item) {
		Node<T> newItem = new Node<T>(item);
		
		if (first == null) {
			last = newItem;
			first = last;
		} else {
			last.setNext(newItem);
			last = last.getNext();
		}
	}
	
	public T dequeue() {
		if (first == null) {
			return null;
		} else {
			T item = first.getElem();
			first = first.getNext();
			return item;
		}
	}
}

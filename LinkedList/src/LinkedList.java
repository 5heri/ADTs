
public class LinkedList<T> implements List<T> {
	
	private Node<T> head;
	private int numElements;

	public Node<T> getHead() {
		return head;
	}
	
	@Override
	public int size() {
		return numElements;
	}

	@Override
	public void add(int position, T newElem) {
		Node<T> newNode = new Node<T>(newElem);
		
		if (position == 1) {
			newNode.setNext(head);
			head = newNode;
		}else {
			Node<T> prev = getNodeAt(position - 1);
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
		numElements++;
	}

	@Override
	public Node<T> delete(int position) {
		numElements--;
		if (position == 1) {
			head = head.getNext();
			return head;
		} else {
			Node<T> prev = getNodeAt(position - 1);
			Node<T> curr = prev.getNext();
			prev.setNext(curr.getNext());
			return head;
		}
	}

	@Override
	public T get(int position) {
		return getNodeAt(position).getElem();
	}
	
	private Node<T> getNodeAt(int position) {
		Node<T> curr = head;
		
		for (int i = 1; i < position; i++) {
			curr = curr.getNext();
		}
		return curr;
	}
	
	public void display() {
		
		Node<T> element = head;
		while (element != null) {
			System.out.print(element.getElem() + " ");
			element = element.getNext();
		}
	}
}

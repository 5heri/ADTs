
public class Main4 {
	//DEMO: partition a linked list around a value x
	public static void main(String[] args) {
		Integer n1 = new Integer(5);
		Integer n2 = new Integer(3);
		Integer n3 = new Integer(2);
		Integer n4 = new Integer(6);
		Integer n5 = new Integer(11);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1, n1);
		list.add(2, n2);
		list.add(3, n3);
		list.add(4, n4);
		list.add(5, n5);
		
		Node<Integer> head = list.getHead();
		
		Node<Integer> newHead = partition(head, 4);
		
		while (newHead != null) {
			newHead.display();
			newHead = newHead.getNext();
		}

	}

	public static Node<Integer> partition(Node<Integer> node, Integer x) {
		Node<Integer> lessThan = null;
		Node<Integer> greaterThan = null;
		
		
		while (node != null) {
			Node<Integer> next = node.getNext();
			if (node.getElem().compareTo(x) < 0) {
				node.setNext(lessThan);
				lessThan = node;
			} else {
				node.setNext(greaterThan);
				greaterThan = node;
			}
			node = next;
		}
		Node<Integer> finalListHead = lessThan;	
		
		while (lessThan.getNext() != null) {
			lessThan = lessThan.getNext();
		}
		
		lessThan.setNext(greaterThan);
		return finalListHead;
		
	}
}


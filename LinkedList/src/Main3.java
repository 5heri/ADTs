
public class Main3 {
	
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
		
		Node<Integer> middle = list.getNodeAt(3);
		
		deleteMiddle(middle);
		list.display();
	}
	
	public static void deleteMiddle(Node<Integer> mid) {
		Node<Integer> next = mid.getNext();
		Integer data = next.getElem();
		
		mid.setElem(data);
		mid.setNext(next.getNext());
	}

}

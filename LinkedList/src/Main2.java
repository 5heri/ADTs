import java.util.Scanner;

//DEMO for returning kth from last element in a linked list
public class Main2 {

	public static void main(String[] args) {
		Integer n1 = new Integer(5);
		Integer n2 = new Integer(3);
		Integer n3 = new Integer(2);
		Integer n4 = new Integer(6);
		Integer n5 = new Integer(11);
		Integer n6 = new Integer(9);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1, n1);
		list.add(2, n2);
		list.add(3, n3);
		list.add(4, n4);
		list.add(5, n5);
		list.add(6, n6);
		
		Node<Integer> head = list.getHead();
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
	
		Node<Integer> kthFromLast = returnKthElementFromLast2(head, k);
		
		if (kthFromLast == null) {
			throw new IndexOutOfBoundsException("K can not be larger then the size of the list");
		}
		kthFromLast.display();

	}
	//Create 2 pointers, one is k behind the other so when the first one hits the end
	//the second one is k behind it.
	public static Node<Integer> returnKthElementFromLast2(Node<Integer> head, int k) {
		Node<Integer> first = head;
		Node<Integer> second = head;
		
		for (int i = 0; i <= k; i++) {
			first = first.getNext();
		}
		
		while (first != null) {
			first = first.getNext();
			second = second.getNext();
		}
		
		return second;
		
	}
	
	//Finds kth element by finding size of list and get the node at (size - k)
	public static Node<Integer> returnKthElementFromLast1(Node<Integer> head, int k) {
		int size = sizeOfList(head);
	
		Node<Integer> curr = head;
		if (k > size) {
			return null;
		}
		
		for (int i = 1; i < size - k; i++) {
			curr = curr.getNext();
		}
		return curr;
	}
	
	private static int sizeOfList(Node<Integer> head) {
		Node<Integer> curr = head;
		int size = 0;
		while (curr != null) {
			size++;
			curr = curr.getNext();
		}
		return size;
	}

}

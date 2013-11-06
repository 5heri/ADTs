
public class Main7 {

	/*
	 * Checks if a list is palindrome.
	 * Alternate way: Read the elements in the nodes into
	 * a string (no need to use a string buffer as strings
	 * do not change). Reverse the string and compare the 
	 * reversed string with the original. If equal it means 
	 * that the linkedList is palindrome.
	 */
	public static void main(String[] args) {
		
		Integer n1 = new Integer(1);
		Integer n2 = new Integer(2);
		Integer n3 = new Integer(0);
		Integer n4 = new Integer(2);
		Integer n5 = new Integer(1);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1, n1);
		list.add(2, n2);
		list.add(3, n3);
		list.add(4, n4);
		list.add(5, n5);
		
		Node<Integer> head = list.getHead();
		System.out.println(isPalindrome(head));
	}
	
	public static boolean isPalindrome(Node<Integer> head) {
		int size = size(head);
		
		boolean checker = true;
		
		if (size == 1) {
			return true;
		}
		
		Node<Integer> reverseNode = head;
		Node<Integer> current = head;
		
		for (int i = 0; i < (size / 2) + 1; i++) {
			
			for (int skip = 1; skip < (size - i); skip++) {
				reverseNode = reverseNode.getNext();
			}
			if (!current.getElem().equals(reverseNode.getElem())) {
				checker = false;
				break;
			}
			reverseNode = head;
			current = current.getNext();
		}		
		return checker;
	}
		
	private static int size(Node<Integer> head) {
		int count = 0;
		
		while (head != null) {
			count++;
			head = head.getNext();
		}
		return count;
	}

}

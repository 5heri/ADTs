import java.util.HashSet;
import java.util.Set;

//DEMO for removing duplicates from a linked list
public class Main1 {

	public static void main(String[] args) {
		Integer n1 = new Integer(5);
		Integer n2 = new Integer(2);
		Integer n3 = new Integer(2);
		Integer n4 = new Integer(6);
		Integer n5 = new Integer(9);
		Integer n6 = new Integer(9);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1, n1);
		list.add(2, n2);
		list.add(3, n3);
		list.add(4, n4);
		list.add(5, n5);
		list.add(6, n6);
		
		list.display();
		System.out.println();
		removeDuplicate2(list.getHead());
		list.display();
		
		

	}
	
	//Removes duplicates with using hashmap at the cost of high complexity 
	private static void removeDuplicate2(Node<Integer> head) {
		
		Node<Integer> curr = head;
		
		while (curr != null) {
			Node<Integer> checker = curr.getNext();
			
			while (checker != null) {
				if (checker.getElem().equals(curr.getElem())) {
					curr.setNext(checker.getNext());
				}
				checker = checker.getNext();
			}
			curr = curr.getNext();
		}
		
	}
	
	// TODO: Fix parameter and return objects. Heads of list instead of entire lists
	// Uses a hashmap to remove duplicates
	private static LinkedList<Integer> removeDuplicate1(LinkedList<Integer> list) {
		Set<Integer> numbers = new HashSet<Integer>();
		for (int i = 1; i <= list.size(); i++) {
			numbers.add(list.get(i));
			
		}
		System.out.println(numbers.toString());
		
		for (int i = 1; i <= list.size(); i++) {
			if (numbers.contains(list.get(i))) {
				numbers.remove(list.get(i));
			} else {
				list.delete(i);
			}
		}
		return list;
		
	}

}

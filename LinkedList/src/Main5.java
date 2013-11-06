
public class Main5 {

	/*
	 * DEMO:
	 * Given LinkedList (7->1->6) and (5->9->2)
	 * That is 617 + 592 = 912.
	 * Output = (2->1->9)
	 * 
	 * If lists are not in reverse order then
	 * do not reverse string buffers and add into
	 * the final linkedList from the back
	 * of the stringBuffer.
	 * 
	 */
	public static void main(String[] args) {
		Integer n1 = new Integer(7);
		Integer n2 = new Integer(1);
		Integer n3 = new Integer(6);
		Integer n4 = new Integer(5);
		Integer n5 = new Integer(9);
		Integer n6 = new Integer(2);
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list1.add(1, n1);
		list1.add(2, n2);
		list1.add(3, n3);
		
		list2.add(1, n4);
		list2.add(2, n5);
		list2.add(3, n6);
		
		Node<Integer> head1 = list1.getHead();
		Node<Integer> head2 = list2.getHead();
		Node<Integer> addedList = addLists(head1, head2);
		
		while (addedList != null) {
			addedList.display();
			addedList = addedList.getNext();
		}
		

	}
	
	public static Node<Integer> addLists(Node<Integer> list1, Node<Integer> list2) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		
		while (list1 != null) {
			sb1.append(list1.getElem());
			list1 = list1.getNext();
		}
		sb1.reverse();
		
		while (list2 != null) {
			sb2.append(list2.getElem());
			list2 = list2.getNext();
		}
		sb2.reverse();
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		int sum = Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
		StringBuffer sumSB = new StringBuffer();
		sumSB.append(sum);
		
		list1 = null;
		for (int i = 0; i < sumSB.length(); i++) {
			Node<Integer> newNode = new Node(sumSB.charAt(i));
				newNode.setNext(list1);
				list1 = newNode;	
		}
		
		System.out.println(sumSB);
		
		return list1;
	}

}

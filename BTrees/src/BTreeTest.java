
public class BTreeTest {

	public static void main(String[] args) {

		Node<Integer> root = new Node<Integer>(0);
		BinaryTree<Integer> bt = new BinaryTree<Integer>();

		bt.insert(4);
		bt.insert(6);
		bt.insert(3);
		bt.insert(5);
		bt.insert(2);
		bt.insert(1);
		bt.insert(7);
	
		bt.preOrderDisplay();
		System.out.println();
		bt.inOrderDisplay();
		System.out.println();
		bt.postOrderDisplay();
		
	}

}

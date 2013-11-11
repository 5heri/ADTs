
public class BSTTest {

	public static void main(String[] args) {

		TreeNode<Integer, Character> root = new TreeNode<Integer, Character>(15, 'a');
		BST<Integer, Character> bst = new BST<Integer, Character>(root);

		//Left side
		bst.add(10, 'b');
		bst.add(12, 'c');
		bst.add(13, 'd');
		bst.add(11, 'e');
		bst.add(5, 'f');
		
		//Right side
		bst.add(20, 'g');
		bst.add(17, 'h');
		bst.add(22, 'i');
		bst.add(24, 'j');
	

		
		//Testing delete
		bst.delete(15);
		
		System.exit(0);
	}

}

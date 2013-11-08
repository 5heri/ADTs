
public class BTreeTest {

	public static void main(String[] args) {

		BinaryTree<Integer> bt = new BinaryTree<Integer>();

		bt.insert(4);
		bt.insert(6);
		bt.insert(3);
		bt.insert(5);
		bt.insert(2);
		bt.insert(1);
		bt.insert(7);
		Node<Integer> root = bt.getRoot();

		System.out.println(getHeight(root));
		System.out.println(isBalanced(root));
		/*bt.preOrderDisplay();
		System.out.println();
		bt.inOrderDisplay();
		System.out.println();
		bt.postOrderDisplay();*/
		
		
	}
	
	private static int getHeight(Node<Integer> node) {
		if (node == null) {
			return -1;
		} else {
		return Math.max(getHeight(node.getLeft()), getHeight(node.getRight())) + 1;
	
		}
	}
	
	private static boolean isBalanced(Node<Integer> node) {
		if (node == null) {
			return true;
		} else {
			int heightDiff = getHeight(node.getLeft()) - getHeight(node.getRight());
			if (Math.abs(heightDiff) > 1) {
				return false;
			} else {
				return isBalanced(node.getLeft()) && isBalanced(node.getRight());
			}
		}
	}
}

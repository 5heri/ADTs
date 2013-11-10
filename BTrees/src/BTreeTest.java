import java.util.ArrayList;
import java.util.LinkedList;


public class BTreeTest {

	public static void main(String[] args) {

		/*BinaryTree<Integer> bt = new BinaryTree<Integer>();

		bt.insert(4);
		bt.insert(6);
		bt.insert(3);
		bt.insert(5);
		bt.insert(2);
		bt.insert(1);
		bt.insert(7);
		//Node<Integer> root = bt.getRoot();

		//System.out.println(getHeight(root));
		//System.out.println(isBalanced(root));
		/*bt.preOrderDisplay();
		System.out.println();
		bt.inOrderDisplay();
		System.out.println();
		bt.postOrderDisplay();*/
		
		Integer[] array = {0,1,2,3,4,5,6};
		Node<Integer> root = minimalBST(array);
		Node<Integer> n2 = new Node<Integer>(0);
		Node<Integer> n3 = new Node<Integer>(6);
		Node<Integer> comAns = commonAns(root, n2, n3);
		if (comAns == null) {
			System.out.println("There is no common Ancester.");
		} else {
			System.out.println("The common Ancester is: " + comAns.getElem());			
		}
		
		//System.out.println(contains(root, new Node<Integer>(11)));
		//System.out.println(isValidBST(root));
		System.out.println("----------------------");
		ArrayList<LinkedList<Node<Integer>>> lists = createLists(root);
		for (LinkedList<Node<Integer>> list: lists) {
			
			for (Node<Integer> node : list) {
				System.out.print(node.getElem() + " ");
			}
			System.out.println();
			System.out.println("----------------------");
		}
		
		/*
		 * For testing we add to the tree
		 */
		root.getLeft().getLeft().setLeft(new Node<Integer>(0));
		root.getRight().getLeft().setRight(new Node<Integer>(1));
		root.getLeft().getLeft().getLeft().setLeft(new Node<Integer>(6));
		findPath(root, 10);
		System.out.println("----------------------");
		findPath(root, 4);
		
		System.exit(0);		
	}
	
	/*
	 * 4.9
	 */
	private static void findPath(Node<Integer> node, int sum, int currentSum,
			ArrayList<Node<Integer>> path) {
		if (node == null) {
			return;
		}
		currentSum += node.getElem();
		path.add(node);
		if (currentSum == sum) {
			System.out.print("Path to sum: ");
			for (int i = 0; i < path.size() - 1; i++) {
				System.out.print(path.get(i).getElem() + "->");
				
			}
			System.out.print(path.get(path.size() - 1).getElem());
			System.out.println();
			findPath(node.getLeft(), sum, currentSum, path);
			findPath(node.getRight(), sum, currentSum, path);
		} else {
			findPath(node.getLeft(), sum, currentSum, path);
			findPath(node.getRight(), sum, currentSum, path);
		}
	}
	
	private static void findPath(Node<Integer> node, int sum) {
		if (node == null) {
			return;
		}
		ArrayList<Node<Integer>> path = new ArrayList<Node<Integer>>();
		findPath(node, sum, 0, path);
		findPath(node.getLeft(), sum);
		findPath(node.getRight(), sum);
	}
	
	
	/*
	 * 4.7
	 */
	private static Node<Integer> commonAns(Node<Integer> node, Node<Integer> p, Node<Integer> q) {
		if (p.getElem().equals(q.getElem())) {
			return p;
		}
		if (node.getElem().equals(p.getElem()) || node.getElem().equals(q.getElem())) {
			if (contains(node, p) || contains(node, q)) {
				return node;
			}
		}
		if ((contains(node.getLeft(), p) && contains(node.getRight(), q)) 
				|| ((contains(node.getLeft(), q) && contains(node.getRight(), p)))) {
					return node;
		} else if ((contains(node.getLeft(), p)) && (contains(node.getLeft(), q))) {
			return commonAns(node.getLeft(), p, q);
		} else if ((contains(node.getRight(), p)) && (contains(node.getRight(), q))){
			return commonAns(node.getRight(), p, q);
		}
		return null;
	}
	
	private static boolean contains(Node<Integer> node, Node<Integer> item) {
		if (node == null) {
			return false;
		}
		if (node.getElem().equals(item.getElem())) {
			return true;
		} else {
			return false || contains(node.getLeft(), item) || contains(node.getRight(), item);
		}
	}
	
	/*
	 * 4.6
	 * Assuming that node has a link to its parent.
	 */
	/*private static Node<Integer> inOrderSucc(Node<Integer> node) {
		if (node == null) {
			return null;
		}
		if (node.getRight() != null) {
			return getLeftMost(node);
		}
		
		Node<Integer> parent = node.getParent();
		while (parent != null && parent.getRight() == node) {
			node = parent;
			parent = node.getParent();
		}
		return parent;
	}
	
	private static Node<Integer> getLeftMost(Node<Integer> node) {
		if (node == null) {
			return null;
		}
		while (node.getLeft() != null) {
			node = node.getLeft();
		}
		return node;
	}*/
	
	/*
	 * 4.5
	 */
	private static boolean isValidBST(Node<Integer> node) {
		return isValidBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);		
	}
	
	private static boolean isValidBST(Node<Integer> node, int min, int max) {
		if (node == null) {
			return true;
		}
		
		if (node.getElem() > min && node.getElem() <= max 
				&& isValidBST(node.getLeft(), min, node.getElem())
						&& isValidBST(node.getRight(), node.getElem(), max)) {
			return true;
		}
		return false;
	}
	
	
	/*
	 * 4.4
	 */
	private static void fillList(ArrayList<LinkedList<Node<Integer>>> lists, 
			Node<Integer> node, int depth) {
		if (node != null) {
			lists.get(depth).add(node);
			fillList(lists, node.getLeft(), depth + 1);
			fillList(lists, node.getRight(), depth + 1);
		} else {
			return;
		}
	}
	
	private static ArrayList<LinkedList<Node<Integer>>> createLists(Node<Integer> root) {
		ArrayList<LinkedList<Node<Integer>>> result = new ArrayList<LinkedList<Node<Integer>>>();
		int depth = getHeight(root) + 1;
		for (int i = 0; i < depth; i++) {
			result.add(new LinkedList<Node<Integer>>());
		}
		fillList(result, root, 0);
		return result;
	}
	
	
	/*
	 * 4.3
	 */
	private static Node<Integer> minimalBST(Integer[] array) {
		return minimalBST(array, 0, array.length - 1);
	}
	
	private static Node<Integer> minimalBST(Integer[] array, int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (end + start) / 2;
		Node<Integer> newNode = new Node<Integer>(array[mid]);
		newNode.setLeft(minimalBST(array, start, mid - 1));
		newNode.setRight(minimalBST(array, mid + 1, end));
		return newNode;
		
	}
	 
	/*
	 * 4.1
	 */
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

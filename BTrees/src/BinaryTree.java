
public class BinaryTree<T extends Comparable<T>> {

	private Node<T> root;
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public Node<T> getRoot() {
		return root;
	}
	
	public T getRootElem() {
		return root.getElem();
	}
	
	public void insert(T elem) {
		root = insertElem(root, elem);
	}
	
	private Node<T> insertElem(Node<T> node, T elem) {
		if (node == null) {
			node = new Node<T>(elem);
		} else {
			if (node.getElem().compareTo(elem) >= 0) {
				node.setLeft(insertElem(node.getLeft(), elem));
			} else {
				node.setRight(insertElem(node.getRight(), elem));
				
			}
		}
		return node;
	}
	
	public void preOrderDisplay() {
		preOrderDisplayHelper(root);
	}
	
	public void inOrderDisplay() {
		inOrderDisplayHelper(root);
	}
	
	public void postOrderDisplay() {
		postOrderDisplayHelper(root);
	}
	
	private void preOrderDisplayHelper(Node<T> node) {
		if (node != null) {
			System.out.print(node.getElem() + " ");
			preOrderDisplayHelper(node.getLeft());
			preOrderDisplayHelper(node.getRight());
		}
	}
	
	private void inOrderDisplayHelper(Node<T> node) {
		if (node != null) {
			inOrderDisplayHelper(node.getLeft());
			System.out.print(node.getElem() + " ");
			inOrderDisplayHelper(node.getRight());
		}
	}
	
	private void postOrderDisplayHelper(Node<T> node) {
		if (node != null) {
			postOrderDisplayHelper(node.getLeft());
			postOrderDisplayHelper(node.getRight());
			System.out.print(node.getElem() + " ");
		}	
	}
	
}

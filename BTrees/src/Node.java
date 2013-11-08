
public class Node<T> {
	
	private Node<T> left;
	private Node<T> right;
	private T element;
	
	public Node(T newElem) {
		this.element = newElem;
		this.left = null;
		this.right = null;
	}
	
	public Node(T value, Node<T> left, Node<T> right) {
		this.element = value;
		this.left = left;
		this.right = right;
	}
	
	public boolean isLeaf() {
		return left == null && right == null;
	}
	
	public T getElem() {
		return element;
	}
	
	public void setElem(T newElem) {
		this.element = newElem;
	}
	
	public Node<T> getLeft() {
		return left;
	}
	
	public Node<T> getRight() {
		return right;
	}
	
	public void setLeft(Node<T> leftChild) {
		this.left = leftChild;
	}

	public void setRight(Node<T> rightChild) {
		this.right = rightChild;
	}
}

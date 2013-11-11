import java.util.NoSuchElementException;


public class BST<K extends Comparable<K>, V> {
	
	private TreeNode<K, V> root;
	
	public BST(TreeNode<K, V> root) {
		this.root = root;
	}
	
	public V getRootElem() {
		return root.getValue();
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public boolean contains(K key) {
		return contains(root, key);
	}
	
	public V get(K key) {
		return get(root, key);
	}
	
	
	
	public void add(K key, V value) {
		TreeNode<K, V> newNode = new TreeNode<K, V>(key, value);
		root = add(root, newNode);
	}
	
	public void delete(K key) {
		root = delete(root, key);
	}
	
	private TreeNode<K, V> delete(TreeNode<K, V> node, K key) throws NoSuchElementException {
		if (node == null) {
			throw new NoSuchElementException();
		} else if (node.getKey().equals(key)) {
			node = deleteNode(node);
		} else if (key.compareTo(node.getKey()) < 0) {
			node.setLeft(delete(node.getLeft(), key));
		} else {
			node.setRight(delete(node.getRight(), key));
		}
		return node;
	}
	
	private TreeNode<K, V> deleteNode(TreeNode<K, V> node) {
		if (node.getLeft() == null && node.getRight() == null) {
			return null;
		} else if (node.getRight() == null) {
			return node.getLeft();
		} else if (node.getLeft() == null) {
			return node.getRight();
		} else {
			TreeNode<K, V> replacementNode = findLeftMost(node.getRight());
			TreeNode<K, V> newRight = setLeftTree(node.getRight());
			replacementNode.setRight(newRight);
			replacementNode.setLeft(node.getLeft());
			return replacementNode;
		}
	}
	
	private TreeNode<K, V> setLeftTree(TreeNode<K, V> node) {
		if (node.getLeft() == null) {
			return node.getRight();
		} else {
			TreeNode<K, V> newChild = setLeftTree(node.getLeft());
			node.setLeft(newChild);
			return node;
		}
	}
	
	private TreeNode<K, V> findLeftMost(TreeNode<K, V> node) {
		if (node.getLeft() == null) {
			return node;
		} else {
			return findLeftMost(node.getLeft());
		}
	}
	
	private TreeNode<K, V> add(TreeNode<K, V> node, TreeNode<K, V> newNode) {
		if (node == null) {
			node = newNode;
		} else if (node.getKey().equals(newNode.getKey())) {
			node.setValue(newNode.getValue());
		} else if (newNode.getKey().compareTo(node.getKey()) < 0) {
			node.setLeft(add(node.getLeft(), newNode));
		} else {
			node.setRight(add(node.getRight(), newNode));
		}
		return node;
	}
	
	private V get(TreeNode<K, V> node, K key) {
		if (node == null) {
			return null;
		} else if (node.getKey().equals(key)) {
			return node.getValue();
		} else if (key.compareTo(node.getKey()) < 0) {
			return get(node.getLeft(), key);
		} else {
			return get(node.getRight(), key);
		}
	}
	
	private boolean contains(TreeNode<K, V> node, K key) {
		if (node == null) {
			return false;
		} else if (node.getKey().equals(key)) {
			return true;
		} else if (key.compareTo(node.getKey()) < 0) {
			return contains(node.getLeft(), key);
		} else {
			return contains(node.getRight(), key);
		}
	}
}

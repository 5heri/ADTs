
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


public class TreeNode<K, V> {
	
	private K key;
	private V value;
	private TreeNode<K, V> left;
	private TreeNode<K, V> right;
	
	public TreeNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public TreeNode(K key, V value, TreeNode<K, V> left, TreeNode<K, V> right) {
		this.key = key;
		this.value =value;
		this.left = left;
		this.right = right;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public TreeNode<K, V> getLeft() {
		return left;
	}
	
	public TreeNode<K, V> getRight() {
		return right;
	}

	public void setKey(K newKey) {
		key = newKey;
	}
	
	public void setValue(V newValue) {
		value = newValue;
	}
	
	public void setLeft(TreeNode<K, V> newLeft) {
		left = newLeft;
	}
	
	public void setRight(TreeNode<K, V> newRight) {
		right = newRight;
	}
}

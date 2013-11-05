
public interface List<T> {
	
	public int size();
	
	public void add(int position, T newElem);
	
	public Node<T> delete(int position);
	
	public T get(int position);

}

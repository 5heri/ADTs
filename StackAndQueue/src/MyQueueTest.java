
public class MyQueueTest {

	public static void main(String[] args) {
		
		MyQueue<Integer> queue = new MyQueue<Integer>(5);
		
		queue.push(5);
		queue.push(4);
		queue.push(3);
		
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());

	}

}

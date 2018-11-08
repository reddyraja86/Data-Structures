package Queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.push(10);
		q.push(20);
		q.push(30);
		System.out.println(q);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
}

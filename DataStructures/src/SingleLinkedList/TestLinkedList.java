package SingleLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedListRaju l = new LinkedListRaju();

		for (int i = 1; i < 6; i++) {

			l.add(i * 10);

		}

		printLinkedList(l);

		l.add(2, 800);
		printLinkedList(l);

		ReverseLinkedList r = new ReverseLinkedList();
		r.reverseLinkedList(l.head);
		printLinkedList(l);

		l.delete(2);

		printLinkedList(l);
		
		System.out.println("Recursion");
		
		ReverseLinkedList r1 = new ReverseLinkedList();
		r1.reverse(l.head, null, l.head.nextNode);
		printLinkedList(l);

	}

	public static void printLinkedList(LinkedListRaju l) {

		for (int i = 0; i < l.size; i++) {
			System.out.print(l.get(i) + "  ");
		}

		System.out.println();
	}

}

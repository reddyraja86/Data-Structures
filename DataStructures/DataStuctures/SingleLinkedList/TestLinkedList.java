package SingleLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

/*		LinkedListRaju l = new LinkedListRaju();

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
		*/
		
		LinkedListRaju cycle = new LinkedListRaju();
		CycleDetection r = new CycleDetection();
		//Creating a Circle here in Lined List
		cycle.add(0);
		cycle.add(1);
		cycle.add(2);
		cycle.add(3);
		cycle.add(4);
		cycle.add(5);
		cycle.getNode(5).nextNode=cycle.getNode(1);
		
		r.cycleDetection(cycle.head,cycle);
		r.cycleDetection(cycle.head);
		
		LinkedListRaju llist = new LinkedListRaju(); 

		llist.add(20); 
		llist.add(4); 
		llist.add(15); 
		llist.add(10); 
		
		/*Create loop for testing */
		llist.head.nextNode.nextNode.nextNode.nextNode = llist.head; 
		
		r.cycleDetection(llist.head);

	}

	public static void printLinkedList(LinkedListRaju l) {

		for (int i = 0; i < l.size; i++) {
			System.out.print(l.get(i) + "  ");
		}

		System.out.println();
	}

}

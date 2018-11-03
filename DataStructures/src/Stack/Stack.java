package Stack;
/**
 * 
 * @author rrayappa
 * 
 *  Stack can be implemented using ArrayList or Linked List
 *  
 *	LIFO Last in First out implementation  
 *	Time Complexity will be O(1) constant time
 *
 *	Available methods :
 *		push()  Insert element at top
 *		pop()	Removes element at the top
 *		peek()  Returns the element at the top
 *		
 * 	
 */

 //Here using Linked List for the stack implementation

public class Stack {
	
	int size;
	StackNode head;
	
	public Stack() {
		head = new StackNode();
		head.next = null;
		size = 0;
	}
	
	/*
	 * Push () implementation adding an element at the first location
	 * 	Time complexity will be O(1)
	 */
	
	public void push(int element) {
		//Get the first node in prevNode
		StackNode prevNode = head.next;
		//Create a new Node with data
		StackNode node = new StackNode();
		node.data = element;
		//Udate the prev First node with the new node, next node
		node.next = prevNode;
		//Update the first node with the new node 
		head.next = node;
		size++;
	}
	
	/*
	 * pop() will remove the Last inserted node
	 */
	public Integer pop() {
		
		if(size==0) {
			System.out.println("===NOTHING TO REMOVE========");
		}
		else {
			StackNode nodeToRemove = head.next;
			StackNode updateNode = nodeToRemove.next;
			head.next = updateNode;
			size--;
			return nodeToRemove.data;
		}
		return null;
		
	}
	/*
	 * peek() return the Last inserted Node
	 * Time Complexity O(1)
	 */
	public Integer peek() {
		if(size==0) {
			System.out.println("===NOTHING TO RETRIEVE========");
		}else {
			StackNode peekNode = head.next;
			return peekNode.data;
		}
		
		return null;
	}
	
}

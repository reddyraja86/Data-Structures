package SingleLinkedList;

public class ReverseLinkedList {
	
	public void reverseLinkedList(Node head) {
		
		Node currentNode = head;
		Node prevNode = null;	
		while(currentNode.nextNode!=null) {
			Node nextNode = currentNode.nextNode;
			currentNode.nextNode = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		
		currentNode.nextNode = prevNode;
		
		head.nextNode= currentNode;
		
		
	}
	

}
;
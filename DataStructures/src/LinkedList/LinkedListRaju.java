package LinkedList;


/**
 * 
 * @author rrayappa
 *
 * We are going to implement the following methods in single linked list
 * 
 * 		add(e);
 * 		add(index, element);
 * 		addFirst(e);
 * 		addLast(e);
 * 		contains(o)
 * 	
 */



public class LinkedListRaju {

	//Head will be the starting point and it will be point to the first element in the LinkedList
	 Node head;
	 int size;
	

	//When user created Linked List it will create head element with next value  as null
	public LinkedListRaju() {
		head = new Node();
		head.nextNode = null;
	}
	
	/**
	 * For adding an element we need to traverse to the last and add the element so O(n) time complexity
	 */
	
	public void add(int element) {
		
		Node dataNode = new  Node();
		dataNode.data = element;
		dataNode.nextNode = null;
		
		if(head.nextNode == null ) {
			head.nextNode = dataNode;
		}
		else {
			//This is not the first element
			//iterate through all the element until last element and add the element as last element
			Node currentNode = head;
			while(currentNode.nextNode!=null) {
				currentNode = currentNode.nextNode;
			}
			currentNode.nextNode = dataNode;
		}
		
		size++;
	}
	
	
	/**
	 * @param index   index of linked list
	 * @param element element data that we want to add
	 * 
	 * This will take O(n) time complexity when the index is last element as we need to traverse through all the elements
	 */
	public void add(int index,int element) {
	
		Node currentNode = head;
		
		int dataIndex = 0;
		while(currentNode.nextNode!= null && dataIndex<index) {
			currentNode = currentNode.nextNode;
			dataIndex++;
		}
		
		//After this currentNode will have required  previous index node
		//We need update the next index with new Node 
		//and update new Node nextNode with old node
		
		//New  node with the data
		Node dataNode = new  Node();
		dataNode.data = element;
		
		//Required node to be replaced
		Node tempNextNode = currentNode.nextNode;
		//Remove the link with the current node
		dataNode.nextNode = tempNextNode;
		//relink the new node with current node
		currentNode.nextNode = dataNode;
		
		size++;
	
	}

	public int get(int index) {
		Node currentNode = head;

		int dataIndex = 0;
		while(currentNode.nextNode!= null && dataIndex<=index) {
			currentNode = currentNode.nextNode;
			dataIndex++;
		}
		
		return currentNode.data;

	}
	
	
	//TODO addFirst(e);	addLast(e); implementations
	
	
	

}

package DoubleLinkedList;


/*
 * @author rrayappa
 *	 
 * Double linked list contains Node with previous and next positions 
 * Previous will point to the prev Node
 * Next will point to the Next node
 * 
 * First Node will be head node and we can maintain tail node act as the last node
 * 
 * 
 *			<-- Prev			<-- Prev			<-- Prev
 *  HEAD      - NODE -		      - NODE -		      - NODE(TAIL) - NULL		
 * 				Next --> 			Next -->			Next -->		
 *   
 *   
 *   Methods
 *   Add ()
 *   Add(index ,element)
 *   AddFirst()
 *   AddLast()
 *   Remove()
 *   
 */

public class DoubleLinkedList {

	Node head;
	int size;
	Node tail;
	
	public DoubleLinkedList(){
		head = new Node();
		size =0;
		tail= head;
	}
	
	/**
	 * 
	 * @param element data that we want to add 
	 * Time complexity will be O(1) as we are maintaining the tail element
	 * 
	 */
	public void add(int element){
		Node node = new Node();
		node.data = element;
		
		//When the Linked List Doesnt have any elements in it
		if(size ==0 ){
			head.next = node;
			node.prev = head;
		}
		//When the Linked List contains some elements other than one
		else{
			Node prev = tail.prev;
			prev.next = node;
		}
		tail = node;
		size++;
	}
	
	/**
	 * 
	 * @param index  Index of the newly added element
	 * @param element Element that we need to add in the index
	 * 
	 *  Time Complexity will be O(n) as we need to navigate through all the elements to identify the element index
	 * 
	 */
		
	public void add(int index,int element){
		
		Node newNode = new Node();
		newNode.data = element;
		
		
		Node currentNode = head;
		int count = 0;
		
		//Navigate till the current Node
		while (currentNode.next!= null && count<=index){
			currentNode = currentNode.next;
			count++;
		}
		Node prev = currentNode.prev;
		Node next = currentNode.next;
		
		
		prev.next= newNode;
		newNode.next=next;
			
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

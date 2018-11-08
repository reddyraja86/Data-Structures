package Queue;

/**
 * 
 * Queue Implementation using Linked List 
 * 
 * FIFO first in first out implementation
 * 
 */

public class Queue {

	Node head;
	int size;
	Node tail;
	
	public Queue(){
		this.head = new Node();
		this.tail = new Node();
		size =0;
	}
	
	/*
	 *  Add the elements at the tail and takes O(1) constant time
	 */
	public void push(int data){
		Node dataNode  = new Node();
		dataNode.data = data;
		
		if(size ==0 ){
			head.next = dataNode;
		}else{
			Node prevTail = tail;
			prevTail.next = dataNode;
		}
		tail = dataNode;
		size++;
	}
	
	/*
	 * Removes the element from the Head
	 * 
	 * O(1) time complexity
	 */
	
	public int pop(){
		
		if(size==0){
			System.out.println("----NOTHING TO REMOVE-----");
			return 0;
		}else{
			Node remove = head.next;
			head.next =  remove.next;
			size--;
			return remove!=null? remove.data: 0;
		}
			
	}
	
	
}

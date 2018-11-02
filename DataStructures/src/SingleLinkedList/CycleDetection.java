package SingleLinkedList;

import com.sun.xml.internal.bind.v2.util.FatalAdapter;

public class CycleDetection {

	//TODO : Check  if linked list contains loop Floyd Cycle Detection algorithm
	
		/**
		 * 
		 * 	Floyds Cycle Detection
		 * 	Early and slowly two variable
		 * 		In one Iteration
		 * 			Early takes Two step
		 * 			Slowly	takes one step
		 *  At some point of time they will connect with each other then there is a circle
		 *  If early reaches null then it is end so no circle
		 * 
		 * 
		 */
		
		public void cycleDetection(Node head,LinkedListRaju l){
			
			int lazy = 0,early = 0;
			
			//TODO : Implement without the size of the Linked List
			int size = l.size;
			
			Node lazyNode=head ,earlyNode=head;
			while(lazyNode.nextNode!=null && lazy<size){
				
				lazyNode = lazyNode.nextNode;
				lazy++;
				
				earlyNode = lazyNode.nextNode;
				early = early+2;
				
				if(early>=size){
					early = size- early;
				}
				
			}
			
			System.out.println("========= Detected a Circle At ==========="+lazy);
			
			
		}
		
		
		
		/**
		 * Better Approach As per the Documentation
		 * 
		 */
		public void cycleDetection(Node head){
			Node slow_ptr = head,fast_ptr = head;
			
			while(slow_ptr!=null && fast_ptr!=null && fast_ptr.nextNode!=null){
				slow_ptr = slow_ptr.nextNode;
				fast_ptr = fast_ptr.nextNode.nextNode;
				
				if(slow_ptr == fast_ptr){
					System.out.println("===========LOOP DETECTED ==============="+slow_ptr.data);
				}
					
			}
		}
		
		
}

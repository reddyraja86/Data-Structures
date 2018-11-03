package SingleLinkedList;


public class CycleDetection {

	
	
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
			
			System.out.println("========= Detected a Circle At Index==========="+lazy);
			
			System.out.println(l.get(lazy));
		}
		
		
		//TODO : THIS IS NOT WORKING
		//TODO : Remove the loops in Linked List
		/**
		 * Better Approach As per the Documentation of Floyds Algorithm
		 * 
		 */
		public void cycleDetection(Node head){
			Node slow_ptr = head,fast_ptr = head;
			
			while(slow_ptr!=null && fast_ptr!=null && fast_ptr.nextNode!=null){
				slow_ptr = slow_ptr.nextNode;
				fast_ptr = fast_ptr.nextNode.nextNode;
				
				if(slow_ptr == fast_ptr){
					System.out.println("===========LOOP DETECTED ==============="+fast_ptr.data);
					return;
				}
					
			}
			
		}
		
		
}

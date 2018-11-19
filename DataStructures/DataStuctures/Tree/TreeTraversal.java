package Tree;

import Queue.Queue;

/**
 * 
 * @author rrayappa
 *	
 *	A binary tree can be travesed in 2 ways
 *		BFS (breath First Search )
 *		DFS ( Depth First Search)
 *				PreOrder			
 *				InOrder
 *				PostOrder
 */
public class TreeTraversal {
	
	public void preOrder(TreeNode node) {

		if (node == null) {
			return;
		}
		System.out.println(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}	

	public void inOrder(TreeNode node) {

		if (node == null) {
			return;
		}
		preOrder(node.left);
		System.out.println(node.data);
		preOrder(node.right);

	}
	
	
	public void postOrder(TreeNode node) {

		if (node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);
		System.out.println(node.data);

	}	
	
	
	/*
	 * In case of BFS we will make use of queue 
	 * 	1.read node and add it to the queue
	 * 	2.while popping from queue add left and right nodes again to the queue   
	 * 
	 */

	/*public void bfsTraversal(TreeNode node){
		
		Queue  q = new Queue();
		
		q.push(node);
		
		while(q.isEmpty()){
			TreeNode nodedata = q.pop();
			System.out.println(nodedata.data);
			if(nodedata.left!= null) q.push(nodedata.left);
			if(nodedata.right!= null) q.push(nodedata.right);
		}
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

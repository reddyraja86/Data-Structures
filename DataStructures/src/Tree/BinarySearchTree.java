package Tree;


/**
 * 
 * @author rrayappa
 *
 * Binary search Tree Left side we will have lesser data than the Node
 * 					  Right tree will have higher data than the Node 
 * 
 */
public class BinarySearchTree {
	
	TreeNode root;
	
	
	/*
	 * Adding an element to the 
	 */
	public void addNode(int data){
		root = add(root,data);
	}
	
	private TreeNode add(TreeNode root,int data){
		if(root  == null){
			root = new TreeNode();
			root.data = data;
		}
		else{
			if(data < root.data){
				root.left = add(root.left,data);
			}
			else{
				root.right = add(root.right, data);
			}
		}
		return root;
	}
	
	
	/*
	 * Iterative approach for Adding a node in BST
	 */
	
	public void addIterative(int data){
		TreeNode parent =null,current = root;
		if(root == null){
			root = new TreeNode();
			root.data = data;
		}
		else{
			
			while(current!=null){
				parent = current;
				if(data<current.data){
					current = current.left;
				}
				else{
					current = current.right;
				}
			}
		}
	
		if(data < parent.data ){
			TreeNode left = new TreeNode();
			left.data = data;
			parent.left = left;
		}else{
			TreeNode right = new TreeNode();
			right.data = data;
			parent.right = right;
		}
		
	}
	
	/*
	 *  Search the element in O(logn) time complexity
	 */
	
	public boolean search(TreeNode node, int data) {
		if (node == null)
			return false;

		else if (node.data == data)
			return true;

		else if (data < node.data) {
			return search(node.left, data);
		} else {
			return search(node.right, data);
		}
		
	}
	
	
	
}

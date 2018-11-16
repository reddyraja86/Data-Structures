package Tree;
/**
 * 
 * @author rrayappa
 * 
 *  Height of Binary Tree is nothing but the MAX( height of Left Tree + Max of Right Tree ) + 1
 *	In case of leaf Node Height will be 0
 *		But as per above formula MAX( left ,right ) +1
 *								 MAX ( 0 , 0 ) + 1 which return 1 
 *		To avoid this we will return -1 in case of leaf Nodes	
 *
 *
 */
public class HeightOfBST {
	
	public int findHeightOfBST(TreeNode node){
		
		//Return -1 incase of leaf nodes
		if(node.left== null && node.right == null){
			return -1;
		}
		
		int leftHeight = findHeightOfBST(node.left);
		int rightHeight = findHeightOfBST(node.right);
		
		
		return Integer.max(leftHeight, rightHeight)+1;
		
	}

}

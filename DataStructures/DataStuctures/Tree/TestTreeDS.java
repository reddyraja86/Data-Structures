package Tree;

public class TestTreeDS {

	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.addNode(25);
		bst.addNode(20);
		bst.addNode(27);
		bst.addNode(28);
		bst.addNode(19);
		
		System.out.println(bst);
		
		System.out.println(bst.search(bst.root, 19));

	}

}

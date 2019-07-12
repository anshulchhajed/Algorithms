/*
 * 
 * 
 * 
 */
class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() { 
		root = null; 
	}
	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}


		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);


		return root;
	}

	void inorder()  {
		inorderRec(root);
	}

	void preorder()  {
		preOrderRec(root);
	}

	void postOrder()  {
		postOrderRec(root);
	}

	public void minValue() {
		minValueInTree(root);
	}

	public static void minValueInTree(Node node)
	{
		if(node.left!=null) {
			minValueInTree(node.left);	
		}
		else {
			System.out.println("Minimum value of Binary Tree is:"+node.key);	
		}


	}

	public void maxValue() {
		maxValueInTree(root);
	}

	public static void maxValueInTree(Node node)
	{
		if(node.right!=null) {
			maxValueInTree(node.right);	
		}
		else {
			System.out.println("Largest value of Binary Tree is:"+node.key);	
		}


	}


	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	void preOrderRec(Node root) {
		if (root != null) {
			System.out.println(root.key);
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}

	void postOrderRec(Node root) {
		if (root != null) {
			postOrderRec(root.left);
			postOrderRec(root.right);
			System.out.println(root.key);
		}
	}

	void height() {
		int x = heightOfTree(root);
		System.out.println(x);
	}

	int heightOfTree(Node node)  
	{ 
		if (node == null) 
			return 0; 
		else 
		{ 
			/* compute the depth of each subtree */
			int lDepth = heightOfTree(node.left); 
			int rDepth = heightOfTree(node.right); 

			/* use the larger one */
			if (lDepth > rDepth) 
				return (lDepth + 1); 
			else 
				return (rDepth + 1); 
		} 
	} 

	public void lca(int n1,int n2) {
		Node node=lowestCommonAncestor(root,n1,n2);
		System.out.println("Lowest Common Ancestor is:"+node.key);
	}

	public Node lowestCommonAncestor(Node node, int n1, int n2)  
	{ 
		if (node == null) 
			return null; 

		// If both n1 and n2 are smaller than root, then LCA lies in left 
		if (node.key > n1 && node.key > n2) 
			return lowestCommonAncestor(node.left, n1, n2); 

		// If both n1 and n2 are greater than root, then LCA lies in right 
		if (node.key < n1 && node.key < n2)  
			return lowestCommonAncestor(node.right, n1, n2); 

		return node; 
	} 

	void getLeafCount()  
	{ 
		System.out.println("Total Leaf Nodes are:" +getLeafCount(root)); 
	} 

	int getLeafCount(Node node)  
	{ 
		if (node == null) 
			return 0; 
		if (node.left == null && node.right == null) {
			System.out.println("Leaf:"+node.key);
			return 1; 
		}
		else
			return getLeafCount(node.left) + getLeafCount(node.right); 
	} 

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();


		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);

		System.out.println("Inorder:-");
		tree.inorder();
		System.out.println("Preorder:-");
		tree.preorder();
		System.out.println("Postorder:-");
		tree.postOrder();

		System.out.println("Height of tree:");
		tree.height();

		tree.minValue();
		tree.maxValue();
		tree.lca(10, 22);
		tree.getLeafCount();
	}
}
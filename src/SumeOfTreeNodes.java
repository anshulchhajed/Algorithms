
class Nodew{
	
	int data;
	Nodew left,right;
	public Nodew(int item) {
		
		data=item;
		left=right=null;
	}
}

class SumOfTreeNodes{
	
	Nodew root=null;
	
	public  void insert(int data) {
		if(root==null) {
			root=new Nodew(data);
		}
		Nodew curr=insertData(root,data);
	}
	
	public Nodew insertData(Nodew node,int data) {
		
		if(data<node.data) {
			
		}
		else {
			
		}
		return node;
	}
	public static void printSumOfNodes() {
		
	}
	public static void main(String[] args) {
		SumOfTreeNodes obj=new SumOfTreeNodes();
		obj.insert(10);
		obj.insert(15);
		obj.insert(32);
		obj.insert(20);
		obj.insert(14);
		obj.insert(18);
		obj.insert(11);
		
		printSumOfNodes();
	}
}
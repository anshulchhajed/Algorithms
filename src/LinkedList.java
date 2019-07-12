
class Node{

	Node next;
	int data;

	Node(int data){
		next=null;
		this.data=data;
	}
}

public class LinkedList {

	Node head;
	public LinkedList() {

		// TODO Auto-generated constructor stub
		head=null;
	}
	public void pushAtfront(int data) {

		Node node=new Node(data);
		if(head==null) {
			head=node;
		}
		else {
			node.next=head;
			head=node;

		}

	}

	public void pushAtend(int data) {

		Node node=new Node(data);
		if(head==null) {
			head=node;
		}
		else {
			Node current =head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=node;
			node.next=null;

		}
	}
	public void pushAtIndex(int index,int data){


		if(head==null) {
			pushAtfront(data);
		}
		else {
			Node current=head;

			for(int i=0;i<index-1;i++) {
				current=current.next;
			}
			Node node=new Node(data);
			node.next=current.next;
			current.next=node;
		}
	}

	public  void printList() {

		Node current=head;

		while(current!=null) {
			System.out.printf("%2d|",current.data);
			current=current.next;

		}

	}

	public void printIndex() {
		Node current=head;
		int i=0;
		while(current!=null) {
			System.out.printf("%2d|",i);
			i=i+1;
			current=current.next;

		}
		System.out.println("\n");
	}
	public static void main(String[] args) {


		LinkedList list=new LinkedList();
		list.pushAtfront(10);
		list.pushAtfront(12);
		list.pushAtfront(15);
		list.pushAtend(20);
		list.pushAtfront(17);
		list.pushAtfront(16);	
		list.pushAtfront(19);
		list.pushAtend(1);
		list.pushAtend(2);	
		list.pushAtend(3);
		list.pushAtIndex(2, 50);
		list.printIndex();
		list.printList();



	}
}

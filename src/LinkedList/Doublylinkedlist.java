package LinkedList;
class DNode{
	int data;
	DNode prev;
	DNode next;
}
class DMethod{
	
	static DNode head,tail;
	
	//Insert at beginning
	public static void InsertAtBegin(int data) {
		
		DNode newNode = new DNode();
		
		newNode.data=data;
		newNode.next=null;
		newNode.prev=null;
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	}
	
	//Insert at End
	
	public static void InsertAtEnd(int data) {
		DNode newNode = new DNode();
		newNode.data= data;
		newNode.prev=null;
		newNode.next=null;
		if(head==null) {
			InsertAtBegin(data);
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		
	}
	
	
	//Insert at Position
	public static void InsertAtPos(int pos,int data) {
		DNode newNode = new DNode();
		newNode.data=data;
		int i=1;
		if(head==null) {
			InsertAtBegin(data);
		}
		else {
			DNode temp =head;
			while(i<pos-1) {
				temp=temp.next; 
				i++;
			}
			newNode.next= temp.next;
			newNode.next.prev=newNode;
			newNode.prev=temp;
			temp.next=newNode;	
		}	
	}
	
	
	//Delete at first
	public static void DeleteAtFirst() {
	   if(head==null) {
		   System.out.println("no nodes");
	   }
	   else {
		   head=head.next;
		   head.prev=null;
	   }
	}
	
	//Delete at end
	public static void DeleteAtEnd() {
		if(head==null) {
			System.out.println("no nodes");	
		}
		else {
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	
	//Delete at Position
	public static void DeleteAtPos(int pos) {
		int i=1;
		DNode temp= head;
		if(head==null) {
			System.out.println("no nodes");
		}
		else {
			while(i<pos) {
				temp=temp.next;
				i++;
				
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}
	
	
	
	//Display
	
	public static void display() {
		DNode temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	
	
	
}


public class Doublylinkedlist extends DMethod {

	public static void main(String[] args) {
		InsertAtBegin(1);
		InsertAtEnd(2);
		InsertAtEnd(4);
		InsertAtPos(3,3);	
		//DeleteAtFirst();
		//DeleteAtEnd();
		//DeleteAtPos(3);
		display();
		
	}

}

package LinkedList;

class CDNode{
	int data;
	CDNode prev;
	CDNode next;
}

class CDMethod{
	
	static CDNode head,tail;
	
	//Insert At Begin
	public static void InsertAtBeginning(int data) {
		
		CDNode newNode =  new CDNode();
		newNode.data=data;
		newNode.prev=null;
		newNode.next=null;
		if(head==null) {
			head=newNode;
			tail=newNode;
			head.next=head;
			head.prev=head;
		}
		else {
			
			head.prev=newNode;
			newNode.next =head;
			tail.next=newNode;
			newNode.prev=tail;
			head=newNode;
		}
		
	}
	
	//Insert At End
	public static void InsertAtEnd(int data) {
		
		CDNode newNode = new CDNode();
		
		newNode.prev=null;
		newNode.next=null;
		if(head==null) {
			InsertAtBeginning(data);
		}
		else{
			newNode.data=data;
			
			tail.next=newNode;
			newNode.prev=tail;
			newNode.next=head;
			head.prev=newNode;
			tail = newNode;
		}
		
		
	}
	
	
	//Insert At position
	public static void InsertAtPos(int pos,int data) {

		CDNode newNode = new CDNode();
		CDNode temp = head;
	
		newNode.prev=null;
		newNode.next=null;
		if(head==null ||pos==1) {
			InsertAtBeginning(data);
		}
		else {
			newNode.data=data;
		int i=1;
		
		while(i<pos-1 && temp.next!=head) {
			temp=temp.next;
			i++;
		}
		if(temp.next==head){
			InsertAtEnd(data);
		}
		else {
		newNode.next=temp.next;
		temp.next.prev=newNode;
		temp.next=newNode;
		newNode.prev=temp;
		}
		
	}
		
	}
	
	//Delete at Begin
	
	public static void DeleteAtBegin() {
		  if(head==null) {
			  System.out.println("NO LIST");
		  }
		  else {
			  head=head.next;
			  head.prev=tail;
			  tail.next=head;
		  }
	}
	
	
	//Delete at End
	public static void DeleteAtEnd() {
		if(head==null) {
			  System.out.println("NO LIST");
		  }
		else {
			tail=tail.prev;
			tail.next=head;
			head.prev=tail;
		}
	}
	
	//Delete at Pos
	public static void DeleteAtPos(int pos) {
		if(head==null) {
			 System.out.println("NO LIST");
		}
		if(pos==1) {
			DeleteAtBegin();
		}
		else {
			int i=1;
			CDNode temp = head;
			while(i<pos && temp.next!=head) {
				temp=temp.next;
				i++;
			}
			if(i!=pos) {
				System.out.println("Invalid position");
			}
			if(temp==tail) {
				DeleteAtEnd();
			}
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}
	}
	
	public static void display() {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
		CDNode temp =head;
		do{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}while(temp!=head);
		}		
		
	}
	
	
	
	
	
}

public class DoublyCircular  extends CDMethod{

	public static void main(String[] args) {
		
		InsertAtEnd(1);
		InsertAtEnd(2);
		InsertAtEnd(4);
		InsertAtEnd(5);
		InsertAtPos(3,3);
		//DeleteAtBegin();
		//DeleteAtEnd();
		//DeleteAtPos(5);
		display();
		
	}

}

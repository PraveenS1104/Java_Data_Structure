package LinkedList;
import java.util.Scanner;
class Node{
	int data;
	Node next;
}
class Method{
	static Node head;
	//Insert at Begin
	
	public static void insertAtBegin(int data) 
	{
		Node newNode = new Node();//node creation
		newNode.data=data;
		newNode.next=null;
		if(head==null){     // if head is null list is empty , so we are pointing head to newnode 
			head = newNode;
		}
		
		else {
			newNode.next= head;
			head = newNode;
		}	
	}
	//Insert At End
	public static void insertAtEnd(int data) {
		Node newNode = new Node();
		newNode.data=data;
		
		if(head==null) {
			insertAtBegin(data);
		}
		else {
			Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
			}
		temp.next=newNode;
		newNode.next=null;
		
		}
	}
	
	//Insert At Middle
	public static void insertAtMiddle(int pos,int data) {
		Node temp = head;
		Node newNode = new Node();
		newNode.data=data;
		//int i=1; use when using for loop
		if(pos==0) {
			insertAtBegin(data);
		}
		else {
		/*while(i<pos-1) {
			temp=temp.next;
			i++;
		}*/ //OR Below
			for(int i=1;i<pos;i++) {
				temp=temp.next;
		}
			
			
		newNode.next=temp.next;
		temp.next=newNode;
	}
		}

	
	
	//Display 
	public static void display() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}
	}
	

	//Delete at Begin
	public static void deleteAtBegin() {
		Node temp=head;
		
		head=head.next;
		temp=null;
		
	}
	
	//Delete at end
	public static void deleteAtEnd() {
		Node temp=head;
		while(temp.next.next !=null) {
			temp=temp.next;
		}
		temp.next = null;
	}

	//Delete at position
	public static void deleteAtMiddle(int pos){
		Node temp = head;
		int i=1;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		temp.next=temp.next.next;
	
	}
	//search
	public static void search(int data) {
		Node temp = head;
		int pos=1,i=0;
		while(temp !=null) {
			if(temp.data==data) {
				 i=pos;
				 break;
			}
			else {
				temp=temp.next;
				pos++;
			}
		}
		
		System.out.println("the element "+data+" is in "+ i +" Th position");
		
	}
	

}

public class Singlylinkedlist extends Method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Singlylinkedlist l1 = new Singlylinkedlist();
		/*System.out.print("Enter number of nodes: ");
		int count=scan.nextInt();
		System.out.print("Enter  the  element: ");
		for(int i=0;i<count;i++) {
			insertAtBegin(scan.nextInt());
		}*/
		insertAtBegin(1);
		insertAtBegin(2);
		insertAtBegin(3);
		insertAtEnd(100);
		insertAtEnd(200);
		insertAtMiddle(3,5);
		display();
		System.out.println();
		//deleteAtBegin();
		//deleteAtEnd();
		//deleteAtMiddle(2);
		//deleteAtMiddle(4);
		search(5);
		display();
		
		
		
	}

}

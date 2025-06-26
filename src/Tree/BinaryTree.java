package Tree;
import java.util.LinkedList;
import java.util.Queue;
class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}

public class BinaryTree {
	Node root;
	
	public BinaryTree() {
		root=null;
	}
	


	public  void insert(int data) {
		
		Node newNode = new Node(data);
		if(root==null) {
			root=newNode;
			return;
		}
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node current = queue.poll();
			if(current.left==null) {
				current.left=newNode;
				break;
			}
			else {
				queue.offer(current.left);
			}
			if(current.right==null) {
				current.right= newNode;
				break;
			}
			else{
				queue.offer(current.right);
			}	
		}	
	}
		
	public void InorderTraversel(Node node) {
		if(node!=null) {
			InorderTraversel(node.left);
			System.out.print(node.data+" ");
			InorderTraversel(node.right);
		}
	}
	
	public void PreorderTraversel(Node node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			PreorderTraversel(node.left);
			PreorderTraversel(node.right);
		}
	}
	
	public void PostorderTraversel(Node node) {
		if(node!=null) {
			
			PostorderTraversel(node.left);
			PostorderTraversel(node.right);
			System.out.print(node.data+" ");
		}
	}
	





	public static void main(String[] args) {
		BinaryTree b1= new BinaryTree();
			b1.insert(10);
			b1.insert(30);
			b1.insert(19);
			b1.insert(45);
			b1.insert(61);
			b1.insert(79);
			b1.insert(80);
			
			System.out.println("In-order Traversal: ");
			b1.InorderTraversel(b1.root);

	        System.out.println("\nPre-order Traversal: ");
	        b1.PreorderTraversel(b1.root);

	        System.out.println("\nPost-order Traversal: ");
	        b1.PostorderTraversel(b1.root);
	}
}



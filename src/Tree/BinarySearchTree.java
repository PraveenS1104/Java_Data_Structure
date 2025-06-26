package Tree;
class BSnode{

	int data;
	BSnode left,right;
	BSnode(int data){
		this.data=data;
		left=right=null;
	}
}



public class BinarySearchTree {
	
	BSnode root;
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int data) {
		BSnode newNode = new BSnode(data);
	
		if(root==null) {
			root=newNode;
		}else {
			BSnode current = root;
			while(true) {
			if(data<=current.data) {
				if(current.left==null) {
					current.left=newNode;
					 break;
				}
				else {
					current=current.left;
				}	
			}
			else {
				if(current.right==null) {
					current.right= newNode;
					break;
				}
				else {
					current=current.right;
				}
			}
				
		}
		
		}
	}
	public void InorderTraversel(BSnode node) {
		if(node!=null) {
			InorderTraversel(node.left);
			System.out.print(node.data+" ");
			InorderTraversel(node.right);
		}
	}
	
	public void PreorderTraversel(BSnode node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			PreorderTraversel(node.left);
			PreorderTraversel(node.right);
		}
	}
	
	public void PostorderTraversel(BSnode node) {
		if(node!=null) {
			
			PostorderTraversel(node.left);
			PostorderTraversel(node.right);
			System.out.print(node.data+" ");
		}
	}
	
	

	
	public static void main(String[] args) {
		BinarySearchTree bs1= new BinarySearchTree();
		bs1.insert(2);
		bs1.insert(4);
		bs1.insert(5);
		bs1.insert(1);
		bs1.insert(3);
		bs1.insert(10);
		bs1.insert(7);
		
		System.out.println("In-order Traversal: ");
		bs1.InorderTraversel(bs1.root);

        System.out.println("\nPre-order Traversal: ");
        bs1.PreorderTraversel(bs1.root);

        System.out.println("\nPost-order Traversal: ");
        bs1.PostorderTraversel(bs1.root);
		
		
	}
	
}

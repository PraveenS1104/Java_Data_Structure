package Graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class GraphList {
	
	
	static List<List<Integer>> li = new LinkedList<List<Integer>>();
	
	public GraphList(int vertices) {
		for(int i=0;i<vertices;i++) {
			li.add(new ArrayList<Integer>());
		}
	}
	
	public static void addEdge(int src,int dest) {
		li.get(src).add(dest);
		li.get(dest).add(src);
	}
	
	public static void print() {
		for(int i=0;i<li.size();i++)
		{
			System.out.print(i+" ");
			for(int j=0;j<li.get(i).size();j++) {
				System.out.print(li.get(i).get(j)+" ");
			}
			System.out.println();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		GraphList g1 = new GraphList(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(0,3);
		addEdge(0,4);
		addEdge(1,4);
		addEdge(1,1);
		addEdge(2,1);
		
		print();
		
	}

}

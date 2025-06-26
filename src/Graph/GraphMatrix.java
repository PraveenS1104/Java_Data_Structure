package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class GraphMatrix {
		static int[][] adjacencymatrix;
		static  int vertices;
		public GraphMatrix(int vertices){
			GraphMatrix.vertices= vertices;
			GraphMatrix.adjacencymatrix=new int[vertices][vertices];
		}
		
		public static void addedge(int src,int dest) {
			adjacencymatrix[src][dest]=1;
			adjacencymatrix[dest][src]=1;
			
		}
		
		
		public static void bfs(int start){
			boolean[] visited = new boolean[vertices];
			Queue<Integer> data = new ArrayDeque<Integer>();
			visited[start]=true;
			data.add(start);
			System.out.print("BFS: ");
			while(!data.isEmpty()) {
				int current = data.poll();
				System.out.print(current+" ");
				for(int i=0;i<vertices;i++) {
					if(adjacencymatrix [current][i]==1 && !visited[i]) {
						visited[i]=true;
						data.add(i);
					}
				}
				
			}
			System.out.println();
			System.out.println();
		
		}
		public static void dfslogic(boolean[] visited,int start) {
			visited[start]=true;
			System.out.println(start+" ");
			for(int i=0;i<vertices;i++) {
				if(adjacencymatrix[start][i]==1 && !visited[i]) {
					dfslogic(visited,start);
				}
			}
		}
		public static void dfs(int start) {
			System.out.println("DFS: ");
			boolean visited[] = new boolean[vertices];
			dfslogic(visited,start);
			
			
		}
		
		public static void display() {
			for(int i=0;i<vertices;i++) {
				for(int j=0;j<vertices;j++) {
					System.out.print(adjacencymatrix[i][j]+" ");
				}
				System.out.println();
				
			}
		}
	
	
	public static void main(String[] args) {
		GraphMatrix g1= new GraphMatrix(6);
		
	
		g1.bfs(0);
		g1.display();
		

	}

}

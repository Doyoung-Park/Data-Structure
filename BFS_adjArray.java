import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_adjArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 정점의 개수
		int m = sc.nextInt();	// 간선의 개수
		int v = sc.nextInt();	// 탐색을 시작할 정점의 번호
		
		boolean[] visited = new boolean[n+1];	// 방문 여부를 검사할 배
		
		int[][] adjArray = new int[n+1][n+1];
		
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			adjArray[v1][v2]=1;
			adjArray[v2][v2]=1;
		}
		System.out.println("BFS-인접행렬");
		bfs_array(v, adjArray, visited);
	}

	public static void bfs_array(int v, int[][] adjArray, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(v);
		visited[v]=true;
	
		while(!queue.isEmpty()) {
			v= queue.poll();
			System.out.print(v +" ");
			
			
			
			for(int i=0; i<adjArray[v].length; i++) {
				if(!visited[i] && adjArray[v][i]==1) {
					queue.add(i);
					visited[i]=true;
				}
			}
		}
	}
}

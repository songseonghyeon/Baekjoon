
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] miro = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
		    String line = br.readLine();
		    for(int j = 0; j < M; j++) {
		        miro[i][j] = line.charAt(j) - '0';
		       // System.out.print(miro[i][j]);
		    }
		   // System.out.println();
		}
		
		Queue<int[]> qu = new ArrayDeque<>();
		qu.add(new int[] {0,0});
		visited[0][0] = true;
		int count = 0;
		while(!qu.isEmpty()) {
			count++;
			int[] x_line = {1, -1, 0, 0};
			int[] y_line = {0, 0, 1, -1};
			
			int size = qu.size();
			for(int j=0; j<size; j++) {
				int[] arr = qu.poll();
				int a = arr[0];
				int b = arr[1];
				//System.out.println("size " + size);
				//System.out.println("a " + a + " b " + b);
				if(a==N-1 && b==M-1) {
					qu.removeAll(qu);
					break;
				}
				for(int i=0; i<4; i++) {
					int xx = a+x_line[i];
					int yy = b+y_line[i];
					if(xx < 0 || yy < 0 || xx >= N || yy >= M) {
						continue;
					}
					
					if(miro[xx][yy] == 1 && visited[xx][yy] == false) {
						qu.add(new int[] {xx, yy});
						visited[xx][yy] = true;
					}
				}
			}
		}
		System.out.println(count);
		
	}
}

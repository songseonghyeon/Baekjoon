
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] tomato = new int[N][M];
		boolean[][] visited = new boolean[N][M];
		Deque<int[]> qu = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < M; j++) {
				tomato[i][j] = Integer.parseInt(st1.nextToken());
				if (tomato[i][j] == 1) {
					qu.add(new int[] { i, j });
					visited[i][j] = true;
					
				}
			}
		}

		int[] x_line = {1, -1, 0, 0};
		int[] y_line = {0, 0, 1, -1};

		int count = 0;
		while (!qu.isEmpty()) {
			int size = qu.size();
			//System.out.println("size = " + size);
			count++;
			for(int k = 0; k<size; k++) {
				int[] num = qu.poll();
				int a = num[0];
				int b = num[1];
				visited[a][b] = true;
				for (int i = 0; i < 4; i++) {
					int xa = a + x_line[i];
					int xb = b + y_line[i];
					if (xa < 0 || xb < 0 || xa >= N || xb >= M) {
						continue;
					}
					if (visited[xa][xb] == false && tomato[xa][xb] != -1) {
						//System.out.println("xa " + xa + " xb " + xb);
						qu.offerLast(new int[] { xa, xb });
						visited[xa][xb] = true;
					}
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for(int j=0; j<M; j++) {
				if(tomato[i][j] == 0 && visited[i][j] == false) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(count-1);
	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean[][] visited = new boolean[N][M];
		
		String[][] campus = new String[N][M];
		Queue<int[]> qu = new ArrayDeque<int[]>();
		
		for(int i=0; i<N; i++) {
			//StringTokenizer st1 = new StringTokenizer(br.readLine(), "");
			String[] str = br.readLine().split("");
			for(int j=0; j<M; j++) {
				campus[i][j] = str[j];   //st1.nextToken();
				if(campus[i][j].equals("I")) {
					qu.add(new int[] {i,j});
					visited[i][j] = true;
				}
			}
		}
		
		int count = 0;
		
		while(!qu.isEmpty()) {
			int[] num = qu.poll();
			int a = num[0];
			int b = num[1];
			//System.out.println("a " + a + "b " + b + "  campus[a][b]  " + campus[a][b]);
			
			if(a+1 <N) {
				if(campus[a+1][b].equals("O") && visited[a+1][b] == false) {
					qu.add(new int[] {a+1, b});
					visited[a+1][b] = true;
				} else if(campus[a+1][b].equals("P") && visited[a+1][b] == false) {
					qu.add(new int[] {a+1, b});
					visited[a+1][b] = true;
					count++;
				}
			}
			if(a-1>=0) {
				if(campus[a-1][b].equals("O") && visited[a-1][b] == false) {
					qu.add(new int[] {a-1, b});
					visited[a-1][b] = true;
				} else if(campus[a-1][b].equals("P") && visited[a-1][b] == false) {
					qu.add(new int[] {a-1, b});
					visited[a-1][b] = true;
					count++;
				}
			}
			if(b+1 <M) {
				if(campus[a][b+1].equals("O") && visited[a][b+1] == false) {
					qu.add(new int[] {a, b+1});
					visited[a][b+1] = true;
				} else if(campus[a][b+1].equals("P") && visited[a][b+1] == false) {
					qu.add(new int[] {a, b+1});
					visited[a][b+1] = true;
					count++;
				}
			}
			if(b-1>=0) {
				if(campus[a][b-1].equals("O") && visited[a][b-1] == false) {
					qu.add(new int[] {a, b-1});
					visited[a][b-1] = true;
				} else if(campus[a][b-1].equals("P") && visited[a][b-1] == false) {
					qu.add(new int[] {a, b-1});
					visited[a][b-1] = true;
					count++;
				}
			}
		}
		if(count > 0) {
			System.out.println(count);
		} else {
			System.out.println("TT");
		}
		
	}

}

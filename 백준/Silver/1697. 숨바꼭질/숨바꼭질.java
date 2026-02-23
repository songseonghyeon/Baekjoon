
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		boolean[] visited = new boolean[100001];
		int[] dot = new int[100001];
		for(int i=0; i<dot.length;i++) {
			dot[i] = 0;
		}
		
		
		Queue<Integer> qu = new ArrayDeque<>();
		qu.add(N);
		int count = 0;
		visited[N] = true;
		while(!qu.isEmpty()) {
			count++;
			int qu_size = qu.size();
			for(int i=0; i<qu_size; i++) {
				int num = qu.poll();

				if(num -1 >=0 && visited[num-1]==false) {
					qu.add(num-1);
					dot[num-1] = count;
					visited[num-1] = true;
				}
				if(num + 1 < dot.length && visited[num+1]==false) {
					qu.add(num + 1);
					dot[num+1] = count;
					visited[num+1] = true;
				}
				if(num * 2 < dot.length && visited[num*2]==false) {
					qu.add(num*2);
					dot[num*2] = count;
					visited[num*2] = true;
				}
			}
			//System.out.println("qu " + qu);
		}
		
		System.out.println(dot[K]);
		
	}
}

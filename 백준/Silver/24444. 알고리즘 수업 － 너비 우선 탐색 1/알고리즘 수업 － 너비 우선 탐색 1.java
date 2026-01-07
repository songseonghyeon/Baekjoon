import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = 0;
		int M = 0;
		int R = 0;
		
		while(st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
		}
		
		ArrayList<Integer>[] list = new ArrayList[N];
		boolean[] visited = new boolean[N];
		int[] count = new int[N];
		
		for(int i=0; i<N; i++) {
			list[i] = new ArrayList<Integer>();
			visited[i] = false;
			count[i] = 0;
		}
		
		for(int i=0; i<M; i++) {
			int a = 0;
			int b = 0;
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			while(st1.hasMoreTokens()) {
				a = Integer.parseInt(st1.nextToken());
				b = Integer.parseInt(st1.nextToken());
			}
			list[a-1].add(b);
			list[b-1].add(a);
		}
		
		for(int i=0; i<N; i++) {
			Collections.sort(list[i], (a,b)->a-b);
		}
		
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(R);
		int num = 1;
		while(!queue.isEmpty()) {
			int data = queue.poll()-1;
			if(visited[data]==true) {
				continue;
			}
			count[data] = num++;
			visited[data] = true;
			for(int child:list[data]) {
				if(!visited[child-1]) {
					queue.add(child);
				}
			}
		}
		
		for(int dd:count) {
			System.out.println(dd);
		}
		
		
		
	}
}

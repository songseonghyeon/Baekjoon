
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		boolean[] visited_dfs = new boolean[N+1];
		boolean[] visited_bfs = new boolean[N+1];
		int[] dfs_count = new int[N];
		int[] bfs_count = new int[N];

		ArrayList<Integer>[] dfs_list = new ArrayList[N];
		ArrayList<Integer>[] bfs_list = new ArrayList[N];

		for (int i = 0; i < N; i++) {
			dfs_list[i] = new ArrayList<Integer>();
			bfs_list[i] = new ArrayList<Integer>();
			dfs_count[i] = 0;
			bfs_count[i] = 0;
		}

		for (int i = 0; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st1.nextToken());
			int b = Integer.parseInt(st1.nextToken());
			dfs_list[b-1].add(a);
			bfs_list[b-1].add(a);
			dfs_list[a-1].add(b);
			bfs_list[a-1].add(b);
		}

		
		for(int i=0; i<N; i++) {
			Collections.sort(dfs_list[i], (a,b)->b-a);
		}
		
		for(int i=0; i<N; i++) {
			Collections.sort(bfs_list[i], (a,b)->a-b);
		}

		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(V);
		while(!stack.isEmpty()) {
			int num = stack.pop();
			if(visited_dfs[num]==true) {
				continue;
			} else {
				visited_dfs[num] = true;
				sb.append(num).append(" ");
			}
			for(int data:dfs_list[num-1]) {
				if(visited_dfs[data]==false) {
					stack.push(data);
				}
			}
		}
		sb.append("\n");
		Queue<Integer> qu = new ArrayDeque<Integer>();
		qu.add(V);
		visited_bfs[V] = true;
		while(!qu.isEmpty()) {
			int num = qu.poll();
			sb.append(num).append(" ");
			for(int data:bfs_list[num-1]) {
				if(visited_bfs[data]==false) {
					qu.add(data);
					visited_bfs[data] = true;
				}
			}
		}
		
		System.out.println(sb);
		
		
		
		
	}
}

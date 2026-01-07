import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int V = 0;
		int E = 0;
		int R = 0;
		while(st.hasMoreTokens()) {
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
		}
		boolean visited[] = new boolean[V];
		ArrayList<Integer>[] list = new ArrayList[V];
		Stack<Integer> stack = new Stack<Integer>();
		int[] count = new int[V];
		stack.push(R);
		
		for(int i=0; i<V; i++) {
			list[i] = new ArrayList<Integer>();
			visited[i] = false;
			count[i] = 0;
		}
		
		for(int i=0; i<E; i++) {
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
		
		for(int i=0; i<V; i++) {
			Collections.sort(list[i], (a,b)->a-b);
		}
		
		/*
		for(ArrayList<Integer> data:list) {
			System.out.println(data);
		}
		*/
		
		int link = 1;
		while(!stack.isEmpty()) {
			int data = stack.pop()-1;
			if(visited[data]==true) {
				continue;
			}
			//방문한 곳은 true
			visited[data] = true;
			count[data] = link++;
			for(int child:list[data]) {
				if(!visited[child-1]) {
					stack.add(child);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int d:count) {
			sb.append(d+"\n");
		}
		System.out.println(sb);
		
	}
}

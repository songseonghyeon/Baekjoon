import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Deque<Integer> qu = new ArrayDeque<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			String order = null;
			int a = 0;
			st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				order = st.nextToken();
				if(st.hasMoreTokens()) {
					a = Integer.parseInt(st.nextToken());
				}
			}
			switch(order) {
			case "push" -> {
				qu.add(a);
			}
			case "pop" -> {
				if(qu.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(qu.poll() + "\n");
				}
			}
			case "size" -> {
				sb.append(qu.size() + "\n");
			}
			case "empty" -> {
				if(qu.isEmpty()) {
					sb.append(1 + "\n");
				} else {
					sb.append(0 + "\n");
				}
			}
			case "front" -> {
				if(qu.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(qu.getFirst() + "\n");
				}
			}
			case "back" -> {
				if(qu.isEmpty()) {
					sb.append(-1 + "\n");
				} else {
					sb.append(qu.getLast() + "\n");
				}
			}
			}
		}
		System.out.println(sb);
		
		
	}
}

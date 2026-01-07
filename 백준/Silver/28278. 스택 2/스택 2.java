import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			int a = 0;
			int b = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while(st.hasMoreTokens()) {
				a = Integer.parseInt(st.nextToken());
				if(a==1) {
					b = Integer.parseInt(st.nextToken());
				}
			}
			switch(a) {
			case 1->{
				stack.add(b);
			}
			case 2->{
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					int data = stack.pop();
					sb.append(data + "\n");
				}
			}
			case 3->{
				sb.append(stack.size() + "\n");
			}
			case 4->{
				if(stack.isEmpty()) {
					sb.append(1 + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}
			case 5->{
				if(stack.isEmpty()) {
					sb.append(-1 + "\n");
				}else {
					int data = stack.lastElement();
					sb.append(data + "\n");
				}
			}
			}
		}
		System.out.println(sb);
		
	}
}

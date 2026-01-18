
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		StringBuilder sb = new StringBuilder();
		int cur = 1;
		for(int i=0; i<N; i++) {
			int target = Integer.parseInt(br.readLine());
			while(cur <= target) {
				stack.push(cur);
				sb.append("+\n");
				cur++;
			}
			if(stack.peek() == target) {
				stack.pop();
				sb.append("-\n");
			} else {
				sb.delete(0, sb.length());
				sb.append("NO");
				break;
			}
		}
		System.out.println(sb);

	}

}

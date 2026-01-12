
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//LinkedList<String> list = new LinkedList<String>();
		//list.add(br.readLine());
		String[] str = br.readLine().split("");
		int N = str.length;
		int M = Integer.parseInt(br.readLine());
		
		Stack<String> left = new Stack<String>();
		Stack<String> right = new Stack<String>();
		for(String data:str) {
			left.push(data);
		}
		
		for(int i=0; i<M; i++) {
			String[] order = new String[2];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int num = 0;
			while(st.hasMoreTokens()) {
				order[num++] = st.nextToken();
				if(st.hasMoreTokens()) {
					order[num] = st.nextToken();
				}
			}
			switch(order[0]) {
			case "L" -> {
				if(N > 0) {
					right.push(left.pop());
					N--;
				}
			}
			case "D" -> {
				if(N < left.size()+right.size()) {
					left.push(right.pop());
					N++;
				}
			}
			case "B" -> {
				if(N > 0) {
					left.pop();
					N--;
				}
			}
			
			case "P" -> {
				left.push(order[1]);
				N++;
			}
			}
		}
		StringBuilder sb = new StringBuilder();
		
		for(String data:left) {
			sb.append(data);
		}
		
		while (!right.isEmpty()) {
		    sb.append(right.pop());
		}
		System.out.println(sb);
		 
	}

}


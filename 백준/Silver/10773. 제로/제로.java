import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> dq = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++) {
			int in = Integer.parseInt(br.readLine());
			
			if(in==0) {
				dq.removeLast();
			}else {
				dq.add(in);
			}
		}
		
		int result=0;
		
		if(dq.size()==0) {
			System.out.println(0);
		}else {
			for(int data:dq) {
				result += data;
			}
			System.out.println(result);
		}
		
		
	}

}


import java.io.*;
import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		PriorityBlockingQueue<Integer> pq = new PriorityBlockingQueue<Integer>(N, 
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return Math.abs(o1)!=Math.abs(o2) ? Math.abs(o1)-Math.abs(o2) : o1-o2;
					}
				});
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(pq.poll()).append("\n");
				}
			} else {
				pq.add(num);
			}
		}
		System.out.println(sb);

	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int num = 0;
		int min_num = 0;
		for(int i=0; i<N; i++) {
			num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(pq.isEmpty()) {
					sb.append(0).append("\n");
					min_num = 0;
				} else {
					min_num = pq.poll();
					sb.append(min_num).append("\n");
				}
			} else {
				if(min_num == 0) {
					min_num = num;
					pq.add(num);
				} else if (min_num > num){
					min_num = num;
					pq.add(num);
				} else {
					pq.add(num);
				}
			}
		}
		System.out.println(sb);
	}

}

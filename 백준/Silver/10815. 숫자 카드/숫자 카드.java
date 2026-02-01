
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Set<Integer> list = new HashSet<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i=0; i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int M = Integer.parseInt(br.readLine());
		List<Integer> list2 = new ArrayList<Integer>();
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		while(st1.hasMoreTokens()) {
			if(list.contains(Integer.parseInt(st1.nextToken()))) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		/*
		for(int i=0; i<M; i++) {
			list2.add(Integer.parseInt(st1.nextToken()));
		}
		*/
		System.out.println(sb);
		
	}
}


import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			//List<Integer> list = new ArrayList<>();
			int max_num = arr[0];
			for(int i=0; i<N; i++) {
				int result = 0;
				for(int j=i; j<N; j++) {
					result += arr[j];
					//list.add(result);
					max_num = Math.max(result, max_num);
				}
			}
			
			//Collections.sort(list, (a,b)->b-a);
			sb.append(max_num).append("\n");
		}
		System.out.println(sb);
	}
}

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int all_package = 1001;
		int one_package = 1001;
		int min_price = 0;
		
		for(int i=0; i<M; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int all_line = Integer.parseInt(st1.nextToken());
			int one_line = Integer.parseInt(st1.nextToken());
			all_package = Math.min(all_line, all_package);
			
			one_package = Math.min(one_package, one_line);
		}
		
		if(N <= 6) {
			min_price = Math.min(all_package, one_package * N);
		} else {
			if(all_package < one_package * 6) {
				if(all_package < one_package * (N%6) && N%6 != 0) {
					min_price = (all_package * ((N/6) + 1));
				} else {
					min_price = (all_package * (N/6)) + (one_package * (N%6));
				}
			} else {
				min_price = one_package * N;
			}
		}
		System.out.println(min_price);
	}
}

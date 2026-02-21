
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int case_count = 1;
		while(true) { 
			st = new StringTokenizer(br.readLine(), " ");
			int L = Integer.parseInt(st.nextToken());
			int P = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			
			if(L==0 && P==0 && V==0) {
				break;
			}
				
			int camp = 0;
			
			camp += ((V/P) * L) + Math.min(V%P, L);
			sb.append("Case " + case_count + ": " + camp + "\n");
			case_count++;
			
		}
		System.out.println(sb);
	}
}

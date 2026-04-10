
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> map = new LinkedHashMap<>();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		int hap = 0;
		for(int i=1; i<=N; i++) {
			int val = Integer.parseInt(st1.nextToken());
			map.put(i, val + hap);
			hap += val;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st3.nextToken());
			int b = Integer.parseInt(st3.nextToken());
			if(a==1) {
				sb.append(map.get(b)).append("\n");
			} else {
				sb.append(map.get(b) - map.get(a-1)).append("\n");
			}
		}
		System.out.println(sb);
	}
}


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<10; i++) {
			map.put(i, 0);
		}
		
		for(int i=1; i<=N; i++) {
			String[] str = String.valueOf(i).split("");
			for(String data:str) {
				map.put(Integer.parseInt(data), map.get(Integer.parseInt(data)) + 1);
			}
		}
		
		System.out.println(map.get(D));
		
	}
}

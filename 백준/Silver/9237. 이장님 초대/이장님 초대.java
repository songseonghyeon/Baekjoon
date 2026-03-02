
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 2;
		int max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int now = 0;
		Integer[] arr = new Integer[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr, (a,b)->b-a);
		
		for(int i=0; i<N; i++) {
			//System.out.println(arr[i] + " " + count);
			max = Math.max(arr[i] + count, max);
			count++;
		}
		
		System.out.println(max);
		
	}
}

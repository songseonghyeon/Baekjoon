import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		Integer[] sorted = new Integer[N];
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sorted[i] = arr[i];
		}
		
		Arrays.sort(sorted);
		
		for(int i=0; i<N; i++) {
			map.put(sorted[i], 0);
		}
		
		//System.out.println(map.keySet());
		
		int count = 0;
		for(int data:map.keySet()) {
			map.put(data, count);
			count++;
		}
		
		//시간초과
		/*
		for(int data:map.keySet()) {
			int count = 0;
			for(int data2:map.keySet()) {
				if(data > data2) {
					count++;
				} else {
					break;
				}
			}
			map.put(data, count);
		}
		*/
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(map.get(arr[i])).append(" ");
		}
		System.out.println(sb);
	}
}

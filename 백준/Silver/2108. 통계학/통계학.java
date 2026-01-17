import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double result = 0.0;
		int result_int = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] arr = new int[N];
		int max_num = -4000;
		int min = 4000;
		int max_count = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			result += arr[i];
			result_int += arr[i];
			max_num = Math.max(max_num, arr[i]);
			min = Math.min(min, arr[i]);
			if(map.containsKey(arr[i])) {
				if(max_count < map.get(arr[i])+1) {
					list.removeAll(list);
					list.add(arr[i]);
					max_count = map.get(arr[i])+1;
				} else if(max_count ==  map.get(arr[i])+1) {
					list.add(arr[i]);
				}
				map.put(arr[i], map.get(arr[i])+1);
			} else {
				if(max_count <= 1) {
					list.add(arr[i]);
				}
				map.put(arr[i], 1);
			}
		}
		Arrays.sort(arr);
		Collections.sort(list);
		
		//산술평균
		if(result/N > -0.5 && result/N < 0) {
			System.out.printf("%.0f\n", Math.abs(result/N));
		} else {
			System.out.printf("%.0f\n", result/N);
		}
		
		//중앙값
		System.out.println(arr[N/2]);
		
		if(list.size() > 1) {
			System.out.println(list.get(1));
		} else {
			for(int data:list) {
				System.out.println(data);
			}
		}
		
		System.out.println(Math.abs(max_num-min));
		
		
	}

}

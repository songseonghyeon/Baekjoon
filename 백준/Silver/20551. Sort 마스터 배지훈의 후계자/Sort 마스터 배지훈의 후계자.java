import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 제자들에게 N개의 원소를 가진 배열A
		String[] count = br.readLine().split(" ");

		List<Integer> N_arr = new ArrayList<Integer>();
		for(int i=0; i<Integer.parseInt(count[0]); i++) {
			N_arr.add(Integer.parseInt(br.readLine()));
		}
		
		//오름차순으로 정렬된 배열B
		Collections.sort(N_arr);
		int k=0;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int data:N_arr) {
			if(map.containsKey(data)) {
				k++;
				continue;
			}
			map.put(data, k);
			k++;
		}
		
		//가장 먼저 등장한 위치를 출력, 존재하지 않는 경우에는 -1를 출력
		StringBuilder sb = new StringBuilder();
		
		
		for(int i=0; i<Integer.parseInt(count[1]); i++) {
			int data = Integer.parseInt(br.readLine());
			if(map.containsKey(data)) {
				//N_arr.indexOf(data);
				//가장 먼저 등장한 위치를 출력
				sb.append(map.get(data)+"\n");	
			}else {
				sb.append(-1+"\n");
			}
		}
		
		System.out.println(sb.substring(0, sb.length()-1));
	}
}

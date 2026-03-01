
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		int count = 0;
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
				count = Math.max(count, map.get(str));
			} else {
				map.put(str, 1);
				count = Math.max(count, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();
		for(String data: map.keySet()) {
			if(map.get(data) == count) {
				list.add(data);
			}
		}
		
		Collections.sort(list, (a,b)->a.compareTo(b));
		
		System.out.println(list.get(0));
	}

}

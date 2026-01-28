
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> set = new HashSet<String>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			if(str.length() >= M) {
				set.add(str);
				if(map.containsKey(str)) {
					map.put(str, map.get(str) + 1);
				} else {
					map.put(str, 1);
				}
			}
		}
		ArrayList<String> list = new ArrayList<String>(set);
		
		Collections.sort(list);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return map.get(o1) != map.get(o2) ? map.get(o2) - map.get(o1):o2.length()-o1.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(String data:list) {
			sb.append(data).append("\n");
		}
		System.out.println(sb);
		
		
		
	}
}

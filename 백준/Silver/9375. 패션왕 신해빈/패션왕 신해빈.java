
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0; t<T; t++) {
			int n = Integer.parseInt(br.readLine());
			
			Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
			
			for(int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String type = st.nextToken();
				if(!map.containsKey(type)) {
					List<String> list = new ArrayList<String>();
					list.add(name);
					map.put(type, list);
				} else {
					List<String> list = map.get(type);
					list.add(name);
					map.put(type, list);
				}
			}

			int count = 1;
			for(String key:map.keySet()) {
				List<String> list = map.get(key);
				count *= list.size()+1;
			}
			sb.append(count-1).append("\n");
		}
		System.out.println(sb);
	}
}

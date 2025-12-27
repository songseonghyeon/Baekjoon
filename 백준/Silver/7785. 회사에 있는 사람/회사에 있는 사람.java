
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다
		//다음 n개의 줄에는 출입 기록이 순서대로 주어지며, 각 사람의 이름이 주어지고 "enter"나 "leave"가 주어진다
		// "enter"인 경우는 출근, "leave"인 경우는 퇴근
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Map<String, String> enter_log = new LinkedHashMap<String, String>();
		
		for(int i=0; i<n; i++) {
			String[] arr = br.readLine().split(" ");
			enter_log.put(arr[0], arr[1]);
		}
		
		List<String> key_list = new ArrayList<String>(enter_log.keySet());
		
		//System.out.println("map : " + enter_log);
		
		//사전 역순 비교
		Collections.sort(key_list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}});
		
		//System.out.println("reverse"+key_list);
		
		StringBuilder sb = new StringBuilder();
		for(String val:key_list) {
			if(enter_log.get(val).equals("enter")) {
				sb.append(val + "\n");
			}
		}
		System.out.println(sb);
	}

}

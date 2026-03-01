
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			String participant = br.readLine();
			
			if(map.containsKey(participant)) {
				map.put(participant, map.get(participant) + 1);
			} else {
				map.put(participant, 1);
			}
		}
		
		for(int i=0; i<N-1; i++) {
			String clear = br.readLine();
			
			if(map.get(clear) == 1) {
				map.remove(clear);
			} else {
				map.put(clear, map.get(clear) -1);
			}
		}
		
		for(String data:map.keySet()) {
			System.out.println(data);
		}
		
	}

}

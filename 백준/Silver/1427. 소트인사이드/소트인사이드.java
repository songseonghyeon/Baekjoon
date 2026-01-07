
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");

		List<Integer> list = new LinkedList<Integer>();
		for(String data:str) {
			list.add(Integer.parseInt(data));
		}
		
		Collections.sort(list, (a,b)->b-a);
		//System.out.println(list);
		
		StringBuilder sb = new StringBuilder();
		for(int data:list) {
			sb.append(String.valueOf(data));
		}
		System.out.println(sb);

	}
}

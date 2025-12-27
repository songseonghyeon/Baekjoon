
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		/*
		for(int i=0; i<T; i++) {
			String[] arr = br.readLine().split(" ");
			int count = Integer.parseInt(arr[0]);
			String[] test = arr[1].split("");
			
			for(String data:test) {
				for(int j=0; j<count;j++) {
					sb.append(data);
				}
			}
			sb.append("\n");
		}
		*/
		for(int i=0; i<T; i++) {
			String[] arr = br.readLine().split(" ");
			int count = Integer.parseInt(arr[0]);
			String[] test = arr[1].split("");
			
			for(String data:test) {
				sb.append(data.repeat(count));
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb);
		
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i=0; i<N; i++) {
			String[] arr = br.readLine().split(" ");
			result += Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
		}
		if(X==result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
		
	}
}

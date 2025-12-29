
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] num = br.readLine().split(" ");
		
		long result = 0;
		
		for(int i=0; i<num.length; i++) {
			result += Long.parseLong(num[i]);
		}
		
		System.out.println(result);
	}
}

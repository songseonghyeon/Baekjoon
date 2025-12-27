
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine().trim();
		if(T.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		String[] arr = T.split(" ");
		
		//StringBuilder sb = new StringBuilder();
		System.out.println(arr.length);
		
	}
}

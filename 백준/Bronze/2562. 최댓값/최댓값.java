
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int count = 0;
		for(int i=1; i<=9; i++) {
			int num = Integer.parseInt(br.readLine());
			if(x<num) {
				x=num;
				count = i;
			}
		}
		System.out.println(x);
		System.out.println(count);
		
	}
}

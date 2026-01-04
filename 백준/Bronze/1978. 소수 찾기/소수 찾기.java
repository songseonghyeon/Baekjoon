
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] in = br.readLine().split(" ");
		
		int sosu = 0;
		for(int i=0; i<N; i++) {
			int count = 0;
			int num = Integer.parseInt(in[i]);
			for(int j=1; j<=num; j++) {
				if(num%j==0) {
					count++;
				}
			}
			if(count==2) {
				sosu++;
			}
		}
		System.out.println(sosu);
	}
}

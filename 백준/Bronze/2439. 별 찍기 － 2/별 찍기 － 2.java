
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String str = " ";
		String star = "*";
		int n = 1;
		for(int i=N; i>0; i--) {
			sb.append(str.repeat(N-n)).append(star.repeat(n)).append("\n");
			n++;
		}
		System.out.println(sb);
		
	}
}

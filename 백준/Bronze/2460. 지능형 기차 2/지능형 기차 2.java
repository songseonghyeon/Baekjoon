
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int count = 0;
		for(int i=0; i<10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int out = 0;
			int in = 0;
			while(st.hasMoreTokens()) {
				out = Integer.parseInt(st.nextToken());
				in = Integer.parseInt(st.nextToken());
			}
			count += in - out;
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}

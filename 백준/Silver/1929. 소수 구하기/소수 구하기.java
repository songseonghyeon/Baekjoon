
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		StringBuilder sb = new StringBuilder();
		int M = 0;
		int N = 0;
		while(st.hasMoreTokens()) {
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
		}
		
		boolean[] isPrime = new boolean[N+1];
		for(int i=0; i<=N; i++) {
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i=2; i*i<=N; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j <= N; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		for(int i=M; i<=N; i++) {
			if(isPrime[i]) {
				sb.append(i).append("\n");
			}
		}
		
		
		System.out.println(sb);
	}
	

}

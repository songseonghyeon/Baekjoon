import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = 0;
		int K = 0;
		while(st.hasMoreTokens()) {
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
		}
		
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int a = 0;
			int b = 0;
			while(st1.hasMoreTokens()) {
				a = Integer.parseInt(st1.nextToken());
				b = Integer.parseInt(st1.nextToken());
			}
			arr[i][0] = a;
			arr[i][1] = b;	
		}
		
		int[] dp = new int[K+1];
		for(int i=0; i<dp.length; i++) {
			dp[i] = 0;
		}
		
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=dp.length-1; j>0; j--) {
				if(j >= arr[i][0]) {
					int num = dp[j-arr[i][0]] + arr[i][1];
					dp[j] = Math.max(dp[j], num);
					max = Math.max(max, dp[j]);
				}
			}
		}
		System.out.println(max);
	}
}

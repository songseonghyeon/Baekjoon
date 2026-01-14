import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		
		for(int i=0; i<N+1; i++) {
			int thr = 0;
			int fiv = 0;
			//4인 경우 fiv를 처리해야함.
			int min = 0;
			if(i<3) {
				dp[i] = -1;
				continue;
			}
			if(i==3 || i==5) {
				dp[i] = 1;
				continue;
			}else {
				if(i>3) {
					if(dp[i-3]==-1) {
						thr = -1;
					}else {
						thr += dp[i-3] + 1;
					}
				}
				if(i>5) {
					if(dp[i-5]==-1) {
						fiv = -1;
					}else {
						fiv += dp[i-5] + 1;
					}
				}else {
					fiv = -1;
				}
			}
			if(thr==-1 && fiv == -1) {
				dp[i] = -1;
			}else if(thr != -1 && fiv == -1) {
				dp[i] = thr;
			}else if(thr == -1 && fiv != -1) {
				dp[i] = fiv;
			}else {
				min = Math.min(thr, fiv);
				dp[i] = min;
			}
		}
		System.out.println(dp[N]);
		
		
	}
}

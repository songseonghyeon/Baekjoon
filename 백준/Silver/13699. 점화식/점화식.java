import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger[] dp = new BigInteger[N+1];
		dp[0] = BigInteger.ONE;
		
		
		for(int su=1; su<=N; su++) {
			BigInteger result = BigInteger.ZERO;
			for(int i=0; i<su; i++) {
				result = result.add(dp[i].multiply(dp[su-1-i]));
			}
			dp[su] = result;
		}
		System.out.println(dp[N]);
	}

}


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			int result = 0;
			for(int i=1; i<=N; i++) {
				result += i;
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}

}

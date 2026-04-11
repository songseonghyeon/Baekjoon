
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][N];

		for(int i=0; i<N; i++) {
			int result = 0;
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<N; j++) {
				int a = Integer.parseInt(st1.nextToken());
				result += a;
				arr[i][j] = result;
			}
		}
		
		for(int i=0; i<M; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			int result = 0;
			int y1 = Integer.parseInt(st2.nextToken());
			int x1 = Integer.parseInt(st2.nextToken());
			int y2 = Integer.parseInt(st2.nextToken());
			int x2 = Integer.parseInt(st2.nextToken());

			for(int row = y1-1; row <= y2-1; row++) {
				if(x1 == 1) {
					result += arr[row][x2-1];
				} else {
					result += arr[row][x2-1] - arr[row][x1-2];
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
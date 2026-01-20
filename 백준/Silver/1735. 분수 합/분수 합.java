
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[2][2];
		
		for(int i=0; i<2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}		
		int bunja = (arr[0][0] * arr[1][1]) + (arr[1][0] * arr[0][1]);
		int bunmo = arr[0][1] * arr[1][1];
		
		for(int i=Math.min(bunja, bunmo); i>=1; i--) {
			if(bunja%i == 0 && bunmo%i == 0) {
				bunja = bunja/i;
				bunmo = bunmo/i;
			}
		}
		System.out.printf("%d %d", bunja, bunmo);
		
		
	}
}

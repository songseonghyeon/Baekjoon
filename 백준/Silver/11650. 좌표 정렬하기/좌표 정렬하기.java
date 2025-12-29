
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			String[] num = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(num[0]);
			arr[i][1] = Integer.parseInt(num[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0]!=o2[0]?o1[0]-o2[0]:o1[1]-o2[1];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		System.out.println(sb);
		
		
		
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr, (a,b)->a[1]!=b[1]? a[1]-b[1]:a[0]-b[0] );
		
		int start = arr[0][0];
		int end = arr[0][1];
		List<int[]> list = new ArrayList<>();
		list.add(new int[] {start, end});
		for(int i=0; i<N; i++) {
			int nextStart = 0;
			int nextEnd = 0;
			if(i+1 < N) {
				nextStart = arr[i+1][0];
				nextEnd = arr[i+1][1];
			}
			
			if(end <= nextStart) {
				start = nextStart;
				end = nextEnd;
				list.add(new int[] {start, end});
				//System.out.println("start " + start + " end " + end);
			}
		}
		System.out.println(list.size());
	}
}

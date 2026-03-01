
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[][] score = new String[N][4];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			score[i][0] = st.nextToken();
			score[i][1] = st.nextToken();
			score[i][2] = st.nextToken();
			score[i][3] = st.nextToken();
			//System.out.println(score[i][0] + " " + score[i][1] + " " + score[i][2] + " " + score[i][3] );
		}
		
		
		Arrays.sort(score, new Comparator<String[]>() {

			@Override
			public int compare(String[] a, String[] b) {
				
				if(Integer.parseInt(a[1]) != Integer.parseInt(b[1])) {
					return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
				} else if(Integer.parseInt(a[1]) == Integer.parseInt(b[1])){
					if(Integer.parseInt(a[2]) == Integer.parseInt(b[2])) {
						if(Integer.parseInt(a[3]) == Integer.parseInt(b[3])) {
							return a[0].compareTo(b[0]);
						}
						return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
					}
					return Integer.parseInt(a[2]) - Integer.parseInt(b[2]);
				}
				
				return 0;
			}
		});
		
		
		StringBuilder sb = new StringBuilder();
		for(String[] data: score) {
			sb.append(data[0]).append("\n");
		}
		
		System.out.println(sb);
	}
}

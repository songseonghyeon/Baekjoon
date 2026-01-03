
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
		비교
		012
		013
		014
		023
		024
		034

		123
		124
		134

		234
		*/
		
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][5];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int j=0;
				while(st.hasMoreTokens()) {
					arr[i][j++] = Integer.parseInt(st.nextToken());
				}
		}
		int num = 0;
		int now_max = 0;
		for(int k=0; k<arr.length;k++) {
			int result = 0;
			int[] data = arr[k];
			for(int i=0; i<3; i++) {
				for(int j=i+1; j<=3;j++) {
					for(int h=j+1; h<5; h++) {
						if(h>4) {
							continue;
						}
						
						result = Math.max(result, (data[i]+data[j]+data[h])%10);
						//System.out.println("["+ i + "]" + "["+ (j) + "]" +"["+ h + "]");
						//System.out.println(k + "일의 자리수" + (data[i]+data[j]+data[h])%10);
						//System.out.println("현재의 result : " + result);
					}
				}
			}
			//System.out.println();
			if(now_max <= result) {
				num = k+1;
				now_max = result;
			}
		}
		
		System.out.println(num);
		
	}
}
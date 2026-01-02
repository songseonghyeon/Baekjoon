import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
		
		int i=0;
		while(st1.hasMoreTokens()) {
			A[i++] = Integer.parseInt(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
		int j=0;
		while(st2.hasMoreTokens()) {
			B[j++] = Integer.parseInt(st2.nextToken());
		}
		
		//오름차순 정렬
		Arrays.sort(A);
		
		//최종값
		int min_num = 0;
		
		for(int k=0; k<N; k++) {
			int count = 0;
			for(int t=0; t<N; t++) {
				if(B[k]<B[t]) {
					count++;
				}
				if(B[k]==B[t] && k<t) {
					count++;
				}
			}
			min_num += B[k]*A[count];
			
		}
		System.out.println(min_num);
		
	}

}

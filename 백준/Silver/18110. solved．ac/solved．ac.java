
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N == 0) {
			System.out.println(0);
			return;
		}
		double[] arr = new double[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		double num = (N * 0.15);
		
		long data = Math.round(num);
		
		double average = 0;
		int count = 0;
		for(int i=(int)(data); i<N-data; i++) {
			average += arr[i];
			count++;
		}
		System.out.println(Math.round(average/count));
	}
}


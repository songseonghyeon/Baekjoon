
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int left = 1;
		int left_first = arr[0];
		for(int i=0; i<N; i++) {
			if(left_first < arr[i]) {
				left_first = arr[i];
				left++;
			}
		}
		
		int right = 1;
		int right_first = arr[N-1];
		for(int i=N-1; i>=0; i--) {
			if(right_first < arr[i]) {
				right_first = arr[i];
				right++;
			}
		}
		System.out.println(left);
		System.out.println(right);
		
		
	}
}

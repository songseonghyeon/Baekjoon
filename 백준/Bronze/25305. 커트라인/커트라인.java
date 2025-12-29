
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] count = br.readLine().split(" ");
		int N = Integer.parseInt(count[0]);
		int k = Integer.parseInt(count[1]);
		
		String[] arr = br.readLine().split(" ");
		
		int[] num = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			num[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(num);
		
		System.out.println(num[N-k]);
		
	}
}

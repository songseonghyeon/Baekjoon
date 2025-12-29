
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] num = new int[5];
		int result = 0;
		
		for(int i=0; i<5; i++) {
			num[i] = Integer.parseInt(br.readLine());
			result += num[i];
		}
		
		Arrays.sort(num);
		
		System.out.println(result/num.length);
		System.out.println(num[2]);
		
		
	}
}

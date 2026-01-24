
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int num = 666;
		int result = 0;
		int count = 0;
		String str = null;
		StringBuilder sb = new StringBuilder();
		while(count < N) {
			sb.append(num);
			str = sb.toString();
			if(str.contains("666")){//str.matches(".*666.*")) {
				result = num;
				count++;
			}
			sb.delete(0, sb.length());
			num++;
		}
		System.out.println(result);
	}
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split("");
		int count = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("a")) {
				count++;
			} else if(str[i].equals("e")) {
				count++;
			} else if(str[i].equals("i")) {
				count++;
			} else if(str[i].equals("o")) {
				count++;
			} else if(str[i].equals("u")) {
				count++;
			}
		}
		System.out.println(count);
	}
}

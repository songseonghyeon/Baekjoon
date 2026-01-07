
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = N;
		
		for (int i = 1; i <= N; i++) {
			String[] str = br.readLine().split("");
			String first = str[0];
			Set<String> set = new HashSet<String>();
			set.add(first);
			for(int j=1; j<str.length; j++) {
				if (set.contains(str[j]) && !str[j - 1].equals(str[j])) {
					//System.out.println("---" + str[j - 1] + str[j]);
					count--;
					break;
				}
				set.add(str[j]);
			}
		}
		
		System.out.println(count);

	}

}

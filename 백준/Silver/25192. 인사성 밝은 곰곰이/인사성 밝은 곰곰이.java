
import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<String>();
		int result = 0;
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			if(str.equals("ENTER")) {
				result += set.size();
				set.removeAll(set);
			} else {
				set.add(str);
			}
		}
		result += set.size();
		System.out.println(result);
	}

}

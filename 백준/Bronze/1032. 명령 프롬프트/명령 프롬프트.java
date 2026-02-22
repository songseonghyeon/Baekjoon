
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split("");
		
		for(int i=0; i<N-1; i++) {
			String[] file = br.readLine().split("");
			for(int j=0; j<str.length; j++) {
				if(!str[j].equals(file[j])) {
					str[j] = "?";
				}
			}
		}
		
		for(String data:str) {
			sb.append(data);
		}
		System.out.print(sb);
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Double a = Double.parseDouble(st.nextToken());
		Double b = Double.parseDouble(st.nextToken());
		Double c = Double.parseDouble(st.nextToken());
		
		if(a*b/c > a/b*c) {
			System.out.println((int)(a*b/c));
		} else {
			System.out.println((int)(a/b*c));
		}
	}
}

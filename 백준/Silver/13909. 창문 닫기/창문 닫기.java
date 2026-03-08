
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Long N = Long.parseLong(br.readLine());
		
		System.out.println((int)(Math.sqrt(N)));
		
	}
}

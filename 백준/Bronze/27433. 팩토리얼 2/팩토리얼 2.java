
import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(packto(N));
	}
	
	public static Long packto(int a) {
		if(a<=0) {
			return 1L;
		}
		return a*(packto(a-1));
	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		long su1 = Long.parseLong(arr[0] + arr[1]);
		long su2 = Long.parseLong(arr[2] + arr[3]);
		
		System.out.println(su1+su2);
	}

}

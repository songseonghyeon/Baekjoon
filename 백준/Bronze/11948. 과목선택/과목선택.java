
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer[] arr = new Integer[4];
		Integer[] arr2 = new Integer[2];
		
		for(int i=0; i<4; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0; i<2; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, (a,b)-> b-a);
		Arrays.sort(arr2, (a,b)-> b-a);
		
		int result = 0;
		for(int i=0; i<3; i++) {
			result += arr[i];
		}
		System.out.println(result + arr2[0]);
	}

}


import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] name = new String[N];
		for(int i=0; i<N; i++) {
			name[i] = br.readLine();
		}
		
		for(String data:name) {
			String[] arr = data.split("");
			for(String data1:arr) {
				if(data1.equals("S")) {
					System.out.println(data);
					break;
				}		
			}
		}
	}

}

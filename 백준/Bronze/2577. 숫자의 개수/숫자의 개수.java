
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B =Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int result = A*B*C;
		
		//System.out.println(result);
		int[] arr = new int[10];
		while(result>0) {
			int num = result%10;
			result = result/10;
			switch(num) {
			case 0->{arr[0]++;}
			case 1->{arr[1]++;}
			case 2->{arr[2]++;}
			case 3->{arr[3]++;}
			case 4->{arr[4]++;}
			case 5->{arr[5]++;}
			case 6->{arr[6]++;}
			case 7->{arr[7]++;}
			case 8->{arr[8]++;}
			case 9->{arr[9]++;}
			}
		}
		
		for(int i:arr) {
			System.out.println(i);
		}
	}

}

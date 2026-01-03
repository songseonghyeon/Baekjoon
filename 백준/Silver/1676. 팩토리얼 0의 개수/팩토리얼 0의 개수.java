
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		/*
		int result = 1;
		for(int i=1; i<=N; i++) {
			result *= i;
		}
		
		String stResult = String.valueOf(result);
		String[] arr = stResult.split("");
		
		int count=0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].equals("0")) {
				count++;
			}else {
				break;
			}
		}
		*/
		

        int count = 0;

        while (N >= 5) {
            N /= 5;
            count += N;
        }

        System.out.println(count);
	}

}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int count = 0;
		String[] str = new String[3];
		for(int i=0; i<3; i++) {
			str[i] = br.readLine();
			if(str[i].equals("FizzBuzz") || str[i].equals("Fizz") || str[i].equals("Buzz")) {
				
			} else {
				num = Integer.parseInt(str[i]);
				count = i;
			}
		}
		
		if(count == 0) {
			num += 3;
		} else if(count == 1) {
			num += 2;
		} else {
			num += 1;
		}
		
		if(num%3==0 && num%5==0) {
			System.out.println("FizzBuzz");
		} else if(num%3==0 && num%5!=0) {
			System.out.println("Fizz");
		} else if(num%3!=0 && num%5==0) {
			System.out.println("Buzz");
		} else {
			System.out.println(num);
		}
		
		
	}
}

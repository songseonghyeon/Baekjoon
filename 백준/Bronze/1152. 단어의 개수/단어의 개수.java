import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine().trim();
        //만약 공백이1개 만 들어있을 경우 " " arr의 길이를 읽으면 1이기 때문에 넣어줘야함.
		if(T.isEmpty()) {
			System.out.println(0);
			return;
		}
		
		String[] arr = T.split(" ");
		
		//StringBuilder sb = new StringBuilder();
		System.out.println(arr.length);
		
	}
}

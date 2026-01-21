
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int count = 0;
			boolean[] room = new boolean[k];
			for(int j=0; j<k; j++) {
				room[j] = true;
			}
			
			for(int j=2; j<=k; j++) {
				for(int p=0; p<k; p++) {
					if((p+1)%j==0 && room[p] == false) {
						room[p] = true;
					} else if((p+1)%j==0 && room[p] == true) {
						room[p] = false;
					}
				}
			}
			for(boolean data:room) {
				if(data==true) {
					count++;
				}
			}
			sb.append(count).append("\n");
			
		}
		System.out.println(sb);
		
	}
}

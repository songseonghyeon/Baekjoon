
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[][] info = new String[N][2];
		
		for(int i=0; i<N; i++) {
			String[] arr = br.readLine().split(" ");
			info[i][0] = arr[0];
			info[i][1] = arr[1];
		}
		
		Arrays.sort(info, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				int age1 = Integer.parseInt(o1[0]);
				int age2 = Integer.parseInt(o2[0]);
				return age1 - age2;
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			sb.append(info[i][0] + " " + info[i][1] + "\n");
		}
		System.out.println(sb);
		
		
		
	}
}

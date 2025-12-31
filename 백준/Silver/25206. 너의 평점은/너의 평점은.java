import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double result = 0.0;
		double count = 0;
		for (int i = 0; i < 20; i++) {
			String[] arr = br.readLine().split(" ");

			switch (arr[2]) {
			case "A+" -> {
				result += Double.parseDouble(arr[1]) * (4.5);
				count += Double.parseDouble(arr[1]);
			}
			case "A0" -> {
				result += Double.parseDouble(arr[1]) * (4.0);
				count += Double.parseDouble(arr[1]);
			}
			case "B+" -> {
				result += Double.parseDouble(arr[1]) * (3.5);
				count += Double.parseDouble(arr[1]);
			}
			case "B0" -> {
				result += Double.parseDouble(arr[1]) * (3.0);
				count += Double.parseDouble(arr[1]);
			}
			case "C+" -> {
				result += Double.parseDouble(arr[1]) * (2.5);
				count += Double.parseDouble(arr[1]);
			}
			case "C0" -> {
				result += Double.parseDouble(arr[1]) * (2.0);
				count += Double.parseDouble(arr[1]);
			}
			case "D+" -> {
				result += Double.parseDouble(arr[1]) * (1.5);
				count += Double.parseDouble(arr[1]);
			}
			case "D0" -> {
				result += Double.parseDouble(arr[1]) * (1.0);
				count += Double.parseDouble(arr[1]);
			}
			case "F" -> {
				result += Double.parseDouble(arr[1]) * (0.0);
				count += Double.parseDouble(arr[1]);
			}
			}
		}

		System.out.printf("%.6f", result / count);
	}

}

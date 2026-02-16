
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());

		int[][][] tomato_farm = new int[H][N][M];
		Deque<int[]> qu = new ArrayDeque<>();

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < M; j++) {
					tomato_farm[k][i][j] = Integer.parseInt(st1.nextToken());
					if (tomato_farm[k][i][j] == 1) {
						qu.add(new int[] { k, i, j });

					}
				}
			}
		}

		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					//System.out.print(tomato_farm[k][i][j]);
				}
				//System.out.println();
			}
		}

		int[] z_line = { 0, 0, 0, 0, 1, -1 };
		int[] x_line = { 1, -1, 0, 0, 0, 0 };
		int[] y_line = { 0, 0, 1, -1, 0, 0 };

		int count = 0;
		
		while (!qu.isEmpty()) {
			int size = qu.size();
			// System.out.println("size = " + size);
			count++;
			for (int k = 0; k < size; k++) {
				int[] num = qu.poll();
				int z = num[0];
				int a = num[1];
				int b = num[2];
				for (int i = 0; i < 6; i++) {
					int xz = z + z_line[i];
					int xa = a + x_line[i];
					int xb = b + y_line[i];
					if (xa < 0 || xb < 0 || xz < 0 || xa >= N || xb >= M || xz >= H) {
						continue;
					}
					if (tomato_farm[xz][xa][xb] == 0) {
						//System.out.println("xz " + xz + " xa " + xa + " xb " + xb);
						qu.offerLast(new int[] { xz, xa, xb });
						tomato_farm[xz][xa][xb] = 1;
					}
				}
			}
		}


		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (tomato_farm[k][i][j] == 0) {
						System.out.println(-1);
						return;
					}
				}
			}
		}

		System.out.println(count - 1);
	}

}

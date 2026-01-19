
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            // 문서 번호 -> 중요도
            Map<Integer, Integer> map = new LinkedHashMap<>();
            Deque<Integer> qu = new ArrayDeque<>();

            String[] str = br.readLine().split(" ");
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(str[i]);
                map.put(i + 1, priority);
                arr[i] = priority;
                qu.offerLast(i + 1);
            }

            // 중요도 정렬 (최댓값 관리용)
            Arrays.sort(arr);
            int idx = N - 1;   // 현재 가장 큰 중요도 인덱스
            int count = 0;

            // 프린터 시뮬레이션
            while (!qu.isEmpty()) {
                int cur = qu.peek();              // 현재 문서 번호
                int curPriority = map.get(cur);   // 현재 문서 중요도
                int maxPriority = arr[idx];       // 현재 최대 중요도

                if (curPriority < maxPriority) {
                    // 뒤로 보냄
                    qu.offerLast(qu.poll());
                } else {
                    // 출력
                    qu.poll();
                    count++;
                    idx--; // 하나 출력했으니 최대 중요도 갱신

                    if (cur == M + 1) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }

        System.out.println(sb);
    }
}

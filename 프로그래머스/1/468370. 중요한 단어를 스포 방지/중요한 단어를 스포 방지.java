import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        int n = message.length();
        boolean[] is_spoiler_idx = new boolean[n];
        
        // 1. 스포일러 구간 마킹
        for (int[] range : spoiler_ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                if (i < n) is_spoiler_idx[i] = true;
            }
        }

        // 2. 전체 단어를 순회하며 성격 파악 (가장 안전한 방식)
        List<String> spo_word_list = new ArrayList<>(); // 발견된 스포 단어들 (순서대로)
        Set<String> exposed_words = new HashSet<>();   // 노출된 구간의 단어들
        
        StringBuilder sb = new StringBuilder();
        boolean current_is_spo = false;

        for (int i = 0; i <= n; i++) {
            // 문자의 끝이거나 공백을 만났을 때 = 한 단어가 끝났을 때
            if (i == n || message.charAt(i) == ' ') {
                if (sb.length() > 0) {
                    String word = sb.toString();
                    if (current_is_spo) {
                        spo_word_list.add(word);
                    } else {
                        exposed_words.add(word);
                    }
                }
                // 초기화
                sb.setLength(0);
                current_is_spo = false;
            } else {
                // 단어를 구성하는 문자 중 하나라도 스포일러면 이 단어는 스포 단어
                sb.append(message.charAt(i));
                if (is_spoiler_idx[i]) {
                    current_is_spo = true;
                }
            }
        }

        // 3. 중요한 단어 카운트 (중복 제거 및 노출 여부 확인)
        int count = 0;
        Set<String> already_unlocked = new HashSet<>();
        
        for (String word : spo_word_list) {
            // 조건: 노출 구간에 없어야 함 && 이전에 해제된 적 없어야 함
            if (!exposed_words.contains(word) && !already_unlocked.contains(word)) {
                count++;
            }
            already_unlocked.add(word);
        }

        return count;
    }
}
import java.util.*;

class Solution {
    public String solution(String s) {
        String[] answer = s.split(" ");
        int size = answer.length;
        Arrays.sort(answer, (a, b)->Integer.parseInt(a)-Integer.parseInt(b));
        return(answer[0] + " " + answer[size-1]);
    }
}
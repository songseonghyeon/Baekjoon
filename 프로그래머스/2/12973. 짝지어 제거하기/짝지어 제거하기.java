import java.util.*;

class Solution
{
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        Stack<String> st = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            String data = arr[i];
            if(!st.isEmpty() && st.peek().equals(data)) {
                st.pop();
            } else {
                st.push(data);
            }
            //System.out.println(st);
        }
        if(st.isEmpty()) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}
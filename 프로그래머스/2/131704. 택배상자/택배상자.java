import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i=1; i<=order.length; i++) {
            if(order[answer] != i) {
                stack.push(i);
            } else {
                answer++;
                if(!stack.isEmpty()) {
                    while(stack.peek() == order[answer]) {
                        stack.pop();
                        answer++;
                        if(stack.isEmpty()) {
                            break;
                        }
                    }
                }
            }
        }
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        long q1 = 0L;
        long q2 = 0L;
        Queue<Integer> qu1 = new LinkedList<>();
        Queue<Integer> qu2 = new LinkedList<>();
        
        for(int data:queue1) {
            q1 += data;
            qu1.add(data);
        }
        
        for(int data:queue2) {
            q2 += data;
            qu2.add(data);
        }
        
        long total = q1+q2;
        if(total%2 != 0) {
            return -1;
        }
        
        int answer = 0;
        boolean isSame = true;
        while(isSame) {
            
            //이게 되네?
            if(answer > (queue1.length + queue2.length)*2) {
                answer = -1;
                break;
            } else if(q1 < q2) {
                int data = qu2.poll();
                q2 -= data;
                qu1.add(data);
                q1 += data;
                answer++;
            } else if(q1 > q2) {
                int data = qu1.poll();
                q1 -= data;
                qu2.add(data);
                q2 += data;
                answer++;
            } else if(q1 == q2) {
                isSame = false;
            }
        }
        
        
        return answer;
    }
}
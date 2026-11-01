import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            int time = 100-progresses[i];
            int mok = time/speeds[i];
            int namo = time%speeds[i];
            if(namo == 0) {
                list.add(mok);
            } else {
                list.add(mok+1);
            }
        }
        
        int baepo = list.get(0);
        int job = 0;
        ArrayList<Integer> function = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if(baepo >= list.get(i)) {
                job++;
            } else {
                baepo = list.get(i);
                function.add(job);
                job = 1;
            }
            if(i == list.size()-1) {
                function.add(job);
            }
        }
        int[] answer = new int[function.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = function.get(i);
        }
        return answer;
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int st = 0;
        int end = people.length - 1;
        int weight = 0;
        int count = 0;
        int answer = 0;
        for(int i=end; i>=0; i--) {
            weight += people[i];
            if(weight + people[st] <= limit && st<i) {
                weight += people[st++];
            }
            answer++;
            weight = 0;
            if(i==st) {
                break;
            }
        }
        
        return answer;
    }
}
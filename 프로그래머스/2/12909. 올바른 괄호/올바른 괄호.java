import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] str = s.split("");
        int count = 0;
        for(String data:str) {
            if(data.equals("(")) {
                count++;
            } else {
                count--;
                if(count < 0) {
                    break;
                }
            }
        }
        if(count < 0 || count > 0) {
            answer = false;
        }

        return answer;
    }
}
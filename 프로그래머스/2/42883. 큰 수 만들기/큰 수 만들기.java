import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public String solution(String number, int k) {
        String[] str = number.split("");
        Stack<String> stack = new Stack<>();
        int now = 0;
        for(int i=0; i<str.length; i++) {
            while(!stack.isEmpty() && k>0 && str[i].compareTo(stack.peek()) > 0) {
                stack.pop();
                k--;
            }
            stack.push(str[i]);
        }
        
        StringBuilder sb = new StringBuilder();
        for(String data:stack) {
            sb.append(data);
        }
        String answer = "";
        return sb.substring(0, sb.length() - k);
    }
}
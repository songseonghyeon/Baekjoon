import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        String[] arr = s.split("");
        for(int i=0; i<s.length(); i++) {
            if(i==0) {
                arr[i] = arr[i].toUpperCase();
            } else if(arr[i-1].equals(" ")){
                arr[i] = arr[i].toUpperCase();
            }
        }
        String result = "";
        for(int i=0; i<s.length(); i++) {
            result += arr[i];
        }
        
        
        return result;
    }
}
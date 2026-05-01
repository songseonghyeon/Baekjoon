import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public String solution(String X, String Y) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = X.split("");
        for(String data:str) {
            if(map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }

        String[] str2 = Y.split("");
        
        List<String> list = new ArrayList<>();
        for(String data:str2) {
            if(map.containsKey(data) && map.get(data) >=1) {
                list.add(data);
                map.put(data, map.get(data)-1);
            }
        }
        
        Collections.sort(list, (a,b)->Integer.parseInt(b) - Integer.parseInt(a));
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        for(String data: list) {
            sb.append(data);
        }
        answer = sb.toString();
        if(answer.equals("")) {
            answer = "-1";
        } else if(answer.substring(0,1).equals("0")) {
            answer = "0";
        }
        
        return answer;
    }
}
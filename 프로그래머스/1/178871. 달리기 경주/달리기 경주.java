import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        int st = 0;
        String name = "";
        for(String data:callings) {
            st = map.get(data); //부른 이름의 등수 가져오기
            name = players[st-1]; // 앞사람 이름 가져오기
            map.put(data, map.get(data)-1);
            map.put(name, map.get(name)+1);
            String temp = name;
            players[st-1] = data;
            players[st] = name;
        }
        String[] answer = players;
        return answer;
    }
}
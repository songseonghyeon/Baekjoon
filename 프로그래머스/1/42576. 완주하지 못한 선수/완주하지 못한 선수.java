import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String data:participant) {
            if(map.containsKey(data)) {
                map.put(data, map.get(data) + 1);
            } else {
                map.put(data, 1);
            }
        }
        
        for(String data:completion) {
            if(map.containsKey(data)) {
                map.put(data, map.get(data) - 1);
            }
        }
        
        String name = "";
        for(String key : map.keySet()) {
            if(map.get(key) >= 1) {
                name = key;
            }
        }
        
        return name;
    }
}
import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        //fees
        // 기본 시간, 기본 요금, 단위 시간, 단위 요금
        int st_time = fees[0];
        int st_fee = fees[1];
        int per_min = fees[2];
        int per_fee = fees[3];
        int last_time = 23*60 + 59;
        
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = new TreeSet<>();
        for(String data:records) {
            String[] arr = data.split(" ");
            set.add(arr[1]);
        }
        int num = 0;
        for(String data:set) {
            map.put(data,num++);
        }
        
        Integer[] time_arr = new Integer[set.size()];
        int[] result = new int[set.size()];
        
        for(String data:records) {
            String[] arr = data.split(" ");
            String[] timeStr = arr[0].split(":");
            int time = Integer.parseInt(timeStr[0]) * 60 + Integer.parseInt(timeStr[1]);
            num = map.get(arr[1]);
            if(arr[2].equals("IN")) {
                time_arr[num] = time;
            } else {
                result[num] += time-time_arr[num];
                time_arr[num] = -1;
            }
        }
        
        for(int i=0; i<result.length; i++) {
            if(time_arr[i] == -1) {
                if(st_time < result[i]) {
                    double math = Math.ceil((result[i] - st_time)/(double)per_min);
                    result[i] = st_fee + ((int)math) * per_fee;
                } else {
                    result[i] = st_fee;
                }
            } else {
                result[i] += last_time-time_arr[i];
                if(st_time < result[i]) {
                    double math = Math.ceil((result[i] - st_time)/(double)per_min);
                    result[i] = st_fee + ((int)math) * per_fee;
                } else {
                    result[i] = st_fee;
                }
            }
        }
        return result;
    }
}
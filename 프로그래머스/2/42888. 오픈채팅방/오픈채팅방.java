import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for(String data: record) {
            String[] arr = data.split(" ");
            if(arr[0].equals("Leave")) {
                continue;
            }
            map.put(arr[1], arr[2]);
        }
        
        for(String data: record) {
            String[] arr = data.split(" ");
            switch(arr[0]) {
                    case "Enter" -> list.add(map.get(arr[1]) + "님이 들어왔습니다.");
                    case "Leave" -> list.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }
        
        //System.out.println(list);
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}
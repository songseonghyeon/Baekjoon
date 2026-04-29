import java.lang.*;

class Solution {
    public String solution(String phone_number) {
        String[] arr = phone_number.split("");
        int rep = phone_number.length()-4;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<phone_number.length(); i++) {
            if(i<rep) {
                arr[i] = "*";
            }
            sb.append(arr[i]);
        }
        
        String result = sb.toString();
        
        return result;
    }
}
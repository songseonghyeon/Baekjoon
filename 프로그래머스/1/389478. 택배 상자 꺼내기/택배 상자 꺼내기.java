class Solution {
    public int solution(int n, int w, int num) {
        int height = n%w==0?n/w:n/w+1; //실제 높이
        int namugi = 0;
        if(height%2==0) {
          if(n%w == 0) {
              namugi = 0;
          } else {
              namugi = w-(n%w);
          }
        } else {
            if(n%w==0) {
                namugi = w-1;
            } else {
                namugi = n%w-1;
            }
        }
        int num_height = num%w==0?num/w:num/w+1; // 찾을 택배 높이
        int num_weight = 0; // 찾을 택배 위치
        if(num_height%2==0) {
          if(num%w == 0) {
              num_weight = 0;
          } else {
              num_weight = w-(num%w);
          }
        } else {
            if(num%w==0) {
                num_weight = w-1;
            } else {
                num_weight = num%w-1;
            }
        }
        int answer = 0;
        
        if(height %2 ==0) {
            if(num_weight >= namugi) {
                answer = height - num_height +1;
            } else {
                answer = height - num_height;
            }
        } else {
            if(num_weight <= namugi) {
                answer = height - num_height +1;
            } else {
                answer = height - num_height;
            }
        }
        return answer;
    }
}
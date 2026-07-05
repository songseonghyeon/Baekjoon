import java.util.*;

class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] arr = new int[rows][columns];
        int num = 1;
        //기본 배열 생성
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        int answer_count =0;
        for(int[] data:queries) {
            int y1 = data[0]-1;
            int x1 = data[1]-1;
            int y2 = data[2]-1;
            int x2 = data[3]-1;
            int pre_num = arr[y1+1][x1];
            int min_num = num;
            
            //상하좌우 돌면서 시계방향으로 숫자 옮기기
            for(int i=x1; i<=x2; i++) {
                int temp = arr[y1][i];
                arr[y1][i] = pre_num;
                pre_num = temp;
                if(min_num > temp) {
                    min_num = temp;
                }
            }
            
            for(int i=y1+1; i<=y2; i++) {
                int temp = arr[i][x2];
                arr[i][x2] = pre_num;
                pre_num = temp;
                if(min_num > temp) {
                    min_num = temp;
                }
            }
            
            for(int i=x2-1; i>=x1; i--) {
                int temp = arr[y2][i];
                arr[y2][i] = pre_num;
                pre_num = temp;
                if(min_num > temp) {
                    min_num = temp;
                }
            }
            
            for(int i=y2-1; i>=y1; i--) {
                int temp = arr[i][x1];
                arr[i][x1] = pre_num;
                pre_num = temp;
                if(min_num > temp) {
                    min_num = temp;
                }
            }
            answer[answer_count++] = min_num;
        }
        
        return answer;
    }
}
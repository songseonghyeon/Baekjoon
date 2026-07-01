import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int carpet = brown + yellow;
        for(int i=3; i<carpet; i++) {
            if(carpet%i==0) {
                int garow = i;
                int serow = carpet/i;
                int garow_length = garow-2;
                int serow_length = serow -2;
                if(garow_length * serow_length <= yellow && carpet - (garow_length * serow_length) <= brown) {
                    System.out.println("가로 " + garow);
                    System.out.println("세로 " + serow);
                    answer = new int[] {garow, serow};
                }
            }
        }
        return answer;
    }
}
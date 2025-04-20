import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public ArrayList<Integer>  solution(int k, int[] score) {
        
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        
        for (int point : score) {
            rank.add(point);
            Collections.sort(rank, Collections.reverseOrder());
            
            if (rank.size() > k) {
                rank.remove(rank.size() - 1);
            }
            
            answer.add(rank.get(rank.size() - 1));
        }        
        
        return answer;
    }
}
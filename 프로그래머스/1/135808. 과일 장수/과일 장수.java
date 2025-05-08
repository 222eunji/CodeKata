import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        
        Integer[] scoreArray = Arrays.stream(score)
            .boxed()
            .toArray(Integer[]::new);
        
        Arrays.sort(scoreArray, Collections.reverseOrder());
        
        int totalPrice = 0;
                
        for(int idx = m-1; idx < score.length; idx+=m) {
            totalPrice += scoreArray[idx] * m;
        }
        
        return totalPrice;
    }
}